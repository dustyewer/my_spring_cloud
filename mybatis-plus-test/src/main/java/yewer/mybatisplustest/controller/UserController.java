package yewer.mybatisplustest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import yewer.mybatisplustest.domain.User;
import yewer.mybatisplustest.service.UserService;

@RestController
@RequestMapping("service")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "user/{id}",method = RequestMethod.GET)
    User getUser(@PathVariable Integer id){
        return userService.getById(id);
    }
}
