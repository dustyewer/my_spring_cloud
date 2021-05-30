package yewer.ribbontest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import yewer.ribbontest.model.User;
import yewer.ribbontest.service.UserService;

@RestController
@RequestMapping("service")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "user/{id}",method= RequestMethod.GET)
    User getUser(@PathVariable("id") Integer id){
        return userService.getUser(id);

    }

}
