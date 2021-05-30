package yewer.mybatisplustest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import yewer.mybatisplustest.domain.User;
import yewer.mybatisplustest.mapper.RoleMapper;
import yewer.mybatisplustest.mapper.UserMapper;

@Service
public class TestService {

    @Autowired
    UserMapper userMapper;

    @Autowired
    RoleMapper roleMapper;


    @Transactional(rollbackFor = Exception.class)
    public void test() {

        User user = new User();
        user.setName("yewer");
        user.setPassword("111");


        userMapper.insert(user);
//        int i = 1 / 0;
        return;

    }

}
