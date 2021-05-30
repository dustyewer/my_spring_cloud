package yewer.loadbalancetest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import yewer.loadbalancetest.model.User;
import yewer.loadbalancetest.service.UserService;

@RestController
@RequestMapping("service")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("user/{id}")
    User getUser(@PathVariable Integer id){
        return userService.getUser(id);
    }
}
