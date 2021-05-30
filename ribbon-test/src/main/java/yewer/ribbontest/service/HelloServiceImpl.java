package yewer.ribbontest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloServiceImpl implements  HelloService {
    @Autowired
    RestTemplate restTemplate;

    @Override
    public String getPort() {
        return restTemplate.getForObject("http://jpa-test/hello/port/",String.class);
    }
}
