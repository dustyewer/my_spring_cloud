package yewer.jpatest.service;

import yewer.jpatest.model.User;

import java.util.List;

public interface UserService {
    User getUser(Integer id);

    List<User> myGetUser(String name);
}
