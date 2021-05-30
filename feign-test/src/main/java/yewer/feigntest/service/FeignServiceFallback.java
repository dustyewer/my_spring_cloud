package yewer.feigntest.service;

import org.springframework.stereotype.Component;
import yewer.feigntest.model.User;

@Component
public  class FeignServiceFallback implements FeignService {
    @Override
    public User getUser(Integer id) {
        User user = new User();
        user.setName("这是一个fallback的结果");
        return  user;
    }

    @Override
    public String test() {
        return "这也是fallback";
    }


}
