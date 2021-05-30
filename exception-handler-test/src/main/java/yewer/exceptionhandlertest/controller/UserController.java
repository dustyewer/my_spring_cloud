package yewer.exceptionhandlertest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import yewer.exceptionhandlertest.model.User;
import yewer.exceptionhandlertest.service.UserService;

import java.time.LocalTime;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    UserService userService;
    @RequestMapping("info/{id}")
    public User getUserInfoById(@PathVariable Integer id) throws Exception {
        LocalTime localTime=LocalTime.now();
        if(localTime.getSecond()%2==0){
            User user = userService.getById(id);
            System.out.println(user);
            return user;
        }else{
            throw new Exception("my exp");
        }

    }
}
