package com.study.javaweb.test1.service;

import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import org.apache.ibatis.javassist.bytecode.ByteArray;
import org.apache.tomcat.util.security.MD5Encoder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.text.SimpleDateFormat;
import java.util.*;

@Service
public class RestTempleTestService {
    private RestTemplate restTemplate;

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    private RestTemplate getRestTemplate() {
        if(restTemplate == null) {

            HttpComponentsClientHttpRequestFactory httpRequestFactory = new HttpComponentsClientHttpRequestFactory();
            httpRequestFactory.setConnectTimeout(3000);
            httpRequestFactory.setReadTimeout(3000);
            restTemplate = new RestTemplate(httpRequestFactory);

        }
        return restTemplate;
    }

    private HttpHeaders createHeaders(Map<String, String> map) {
        HttpHeaders headers = new HttpHeaders();
        for (String key : map.keySet()) {
            headers.put(key, new LinkedList<String>() {{
                add(map.get(key));
            }});
        }
        return headers;
    }

    public void httpHeadTest() {
        byte[] data = "12345".getBytes();

        SimpleDateFormat dateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
        dateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        String date = dateFormat.format(new Date(System.currentTimeMillis()));
        String dataMd5 = MD5Encoder.encode(data);
        HttpHeaders headers = createHeaders(new HashMap<String, String>(){{
            put("Content-Md5", dataMd5);
            put("Content-Type","text/.txt");
            put("Date", date);
        }});
        try {
            logger.info("send http request");
            //getRestTemplate().put("http://172.16.0.110:8888", new HttpEntity<>(data, headers));
            getRestTemplate().getForObject("http://172.16.0.110:8888", String.class);
            logger.info("send http requset success");

        } catch (Exception e) {
            logger.error("http put error : {}", e.getMessage());
        }

    }
}
