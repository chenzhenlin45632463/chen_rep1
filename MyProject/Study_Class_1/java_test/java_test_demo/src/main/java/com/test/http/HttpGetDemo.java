package com.test.http;

import com.alibaba.fastjson.JSONObject;
import com.test.http.req.BaseReq;
import com.test.http.req.BaseRespBO;
import com.test.http.req.McEunexRespBO;
import com.test.http.req.McMarket;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.math.BigDecimal;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class HttpGetDemo {
    public static void main(String[] args) {
        HashMap<String, String> param = new HashMap<>();
        HashMap<String, String> headers = new HashMap<>();
        param.put("period","1");
        param.put("symbol","ZMTK_USDT");
        param.put("start_time","1574652477");
        param.put("end_time","1574674093");
        String jurl = "https://openapi.digifinex.vip/v3/kline";
        try {

            String str = httpGetInvokeService(param, jurl, headers);
            BaseRespBO respBO = JSONObject.parseObject(str, BaseRespBO.class);
            System.out.println(str);
//            System.out.println(respBO);
            ArrayList<McMarket> mcMarkets = new ArrayList<>();
            for (List<String> list : respBO.getData()) {
                System.out.println(list);
                /*[0] 时间戳 [1] 交易量 [2] 收盘价 [3] 最高价 [4] 最低价 [5] 开盘价number*/
                McMarket mcMarket = new McMarket();
                mcMarket.setTimestamp(new Long(list.get(0)));
                mcMarket.setVolume(new BigDecimal(list.get(1)));
                mcMarket.setClose(new BigDecimal(list.get(2)));
                mcMarket.setHigh(new BigDecimal(list.get(3)));
                mcMarket.setLow(new BigDecimal(list.get(4)));
                mcMarket.setOpen(new BigDecimal(list.get(5)));
                mcMarkets.add(mcMarket);
            }
            System.out.println(respBO.getData().size());
            for (McMarket mcMarket : mcMarkets) {
                System.out.println(mcMarket);
            }
            System.out.println(mcMarkets.size());
            // 根据返回码判断是否执行成功
            /*if ("ok".equals(respBO.getS()) && !respBO.getNoData()) {
                //转换交易所查询的数据
                List<McMarket> list = new ArrayList<>();
                for (int i = 0; i < respBO.getO().size(); i++) {
                    list.add(convertMarket(respBO, i, "ZMTK", "USDT"));
                }
            }*/
            // 数据转换成json
        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }


    public static String httpGetInvokeService(Map<String, String> params, String url, Map<String, String> headers) throws Exception {
//        log.info("request params ={}, url={}, headers={}", params, url, headers);
        if (StringUtils.isBlank(url)) {
//            log.info("request url is empty!");
            throw new NullPointerException("[request url is required!]");
        }
        if (null != params) {
            String p = "";
            for (Map.Entry<String, String> entry : params.entrySet()) {
                p = p + (StringUtils.isBlank(p) ? "?" : "&") + entry.getKey() + "=" + entry.getValue();
            }
            url += p;
        }
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet(url);
        String resultJsonStr;
        try {
            if (null != headers) {
                for (Map.Entry<String, String> stringEntry : headers.entrySet()) {
                    httpGet.setHeader(stringEntry.getKey(), stringEntry.getValue());
                }
            }
            CloseableHttpResponse response = httpClient.execute(httpGet);
            HttpEntity responseEntity = response.getEntity();
            resultJsonStr = EntityUtils.toString(responseEntity, "utf-8");
            response.close();
        } catch (IOException e) {
//            log.error("[Connection refused or net exception!]", e);
            throw new IOException("[Connection refused or net exception] ={}", e);
        } finally {
            try {
                httpClient.close();
            } catch (Exception e) {
//                log.error("[http client invoke failed!] {}", e.getMessage());
            }
        }
        return resultJsonStr;
    }

}
