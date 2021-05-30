package yewer.jpatest.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import yewer.jpatest.util.MyContext;
import yewer.jpatest.util.MyServiceInfo;

import java.time.LocalTime;

@RestController
@RequestMapping("hello")
public class HelloController {
    @RequestMapping("port")
    public String getHello() throws Exception {
        System.out.println("called");
        LocalTime localTime = LocalTime.now();
        int port = MyServiceInfo.getWebServer().getPort();
        if(localTime.getSecond()%2==0){
            return "port:"+port;
        }else{
            throw new Exception("来自"+port+"的异常");
        }


    }
}
