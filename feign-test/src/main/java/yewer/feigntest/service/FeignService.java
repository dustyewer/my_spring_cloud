package yewer.feigntest.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import yewer.feigntest.model.User;

@Service
//@FeignClient(value = "jpa-test",fallback = FeignServiceFallback.class)
@FeignClient(value = "jpa-test",fallbackFactory = FeignServiceFallbackFactory.class)
public interface FeignService {

    @RequestMapping("service/user/{id}")
    User getUser(@PathVariable("id") Integer id);

    @RequestMapping("hello/port")
    String test();
}
