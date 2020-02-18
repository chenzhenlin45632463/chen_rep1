package com.spring.high.springboot;

import com.spring.high.springboot.bean.Article;
import io.searchbox.client.JestClient;
import io.searchbox.core.Index;
import io.searchbox.core.Search;
import io.searchbox.core.SearchResult;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.io.IOException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot93ElasticApplicationTests {

    @Resource
    JestClient jestClient;

    //elasticSearch索引功能
    @Test
    public void contextLoads() {

        Article article = new Article();
        article.setId(1);
        article.setAuthor("陈陈同学");
        article.setContent("这是陈陈同学写的书的第一句话");
        article.setTitle("陈陈记");
        Index index = new Index.Builder(article).index("atguigu").type("new").build();
        try {
            jestClient.execute(index);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //检索功能
    @Test
    public void search(){
        String json = "{\n" +
                "    \"query\" : {\n" +
                "        \"match\" : {\n" +
                "            \"id\" : \"1\"\n" +
                "        }\n" +
                "    }\n" +
                "}";
        Search search = new Search.Builder(json).addIndex("atguigu").addType("new").build();
        try {
            SearchResult result = jestClient.execute(search);
            System.out.println(result.getJsonString());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
