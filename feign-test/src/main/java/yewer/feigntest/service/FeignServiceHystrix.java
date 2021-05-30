package yewer.feigntest.service;

import yewer.feigntest.model.User;

public class FeignServiceHystrix implements  FeignService{
    @Override
    public User getUser(Integer id) {
        User user = new User();
        user.setName("fallback");
        return user;
    }

    @Override
    public String test() {
        return "fallback";
    }
}
