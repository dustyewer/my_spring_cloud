package yewer.loadbalancetest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import yewer.loadbalancetest.service.HelloServie;

@RestController
@RequestMapping("hello")
public class HelloController {


    @Autowired
    HelloServie helloServie;

    @RequestMapping("port")
    public String getPort(){
        return helloServie.getPort();
    }
}
