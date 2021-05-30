package yewer.jpatest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;
import yewer.jpatest.dao.UserDao;
import yewer.jpatest.model.User;

import java.util.List;

@Service
public class UserServiceImpl implements  UserService {

    @Autowired
    UserDao userDao;

    @Override
    public User getUser(Integer id) {
        return userDao.getOne(id);
    }

    @Override
    public List<User> myGetUser(String name) {
        User user = new User();
        user.setName(name);
        ExampleMatcher matcher = ExampleMatcher.matching()
                .withMatcher("name", ExampleMatcher.GenericPropertyMatchers.contains())
                .withIgnorePaths("id");
        Example<User> example = Example.of(user, matcher);
        List<User> userList = userDao.findAll(example);
        return  userList;
    }
}
