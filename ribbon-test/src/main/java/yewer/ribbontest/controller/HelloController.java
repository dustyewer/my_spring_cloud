package yewer.ribbontest.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import yewer.ribbontest.service.HelloService;

@RestController
@RequestMapping("hello")
public class HelloController {

    @Autowired
    HelloService helloService;

    @RequestMapping("port")
    public String getPort(){
        return helloService.getPort();
    }
}
