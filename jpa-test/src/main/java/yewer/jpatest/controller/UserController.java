package yewer.jpatest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.relational.core.sql.In;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import yewer.jpatest.model.User;
import yewer.jpatest.service.UserService;

import java.time.LocalTime;
import java.util.List;

@RestController
@RequestMapping("service")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping(value = "user/{id}")
    User getUser(@PathVariable("id") Integer id) throws Exception {
        LocalTime localTime = LocalTime.now();
        if(localTime.getSecond()%2==0){
            System.out.println("my was called");
            return userService.getUser(id);
        }else {
            throw new Exception("哈哈,我的异常");
        }

    }

    @RequestMapping("getUserByName/{name}")
    List<User> getUserByName(@PathVariable("name") String name) {
        return userService.myGetUser(name);
    }

}
