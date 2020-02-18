package com.test.http;

import com.alibaba.fastjson.JSONObject;
import com.test.http.req.SendReq;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHeaders;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.HashMap;


public class HttpClientSendPostDemo {
    private static String url = "http://localhost:8104/inner-api/v1/message/sendSmsByAliyun";
    public static void main(String[] args) throws IOException {

        HashMap<String, String> map = new HashMap<>();
        map.put("${activityTheme}","活动主题");
        map.put("${activityTime}","2019-11-30 12:34:45");
        map.put("${activityAddress}","活动地址");
        SendReq sendReq = new SendReq("18381121942","86","EMAIL_BIND_EMAIL",map,1);
        String body = JSONObject.toJSONString(sendReq);
        //封装httpPost请求
        HttpPost httpPost = new HttpPost(url);
        httpPost.setEntity(new StringEntity(body,"utf-8"));
        httpPost.addHeader(HttpHeaders.CONTENT_TYPE,"application/json");
        CloseableHttpResponse response = null;
        //使用HttpClient发送HttpPost请求
        CloseableHttpClient httpClient = HttpClients.createDefault();
        try {
            response = httpClient.execute(httpPost);
            //当请求访问的项目服务未启动时, 报如下错误
            // Connect to localhost:8104 [localhost/127.0.0.1, localhost/0:0:0:0:0:0:0:1]
            // failed: Connection refused: connect
        } catch (IOException e) {
            //send failed
            e.printStackTrace();
        } finally {
            try {
                httpClient.close();
            } catch (IOException e) {
                //close failed
                e.printStackTrace();
            }
        }

        //查看返回结果
        HttpEntity entity = response.getEntity();
        System.out.println(EntityUtils.toString(entity,"UTF-8"));
        response.close();
    }
}
