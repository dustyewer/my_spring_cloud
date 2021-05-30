package yewer.feigntest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import yewer.feigntest.service.FeignService;

@RestController
@RequestMapping("hello")
public class HelloController {

    @Autowired
    FeignService feignService;

    @RequestMapping("port")
    String test(){
        return feignService.test();
    }
}
