package yewer.mybatisplustest;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.checkerframework.checker.units.qual.A;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import yewer.mybatisplustest.domain.User;
import yewer.mybatisplustest.domain.UserPermission;
import yewer.mybatisplustest.domain.UserPermission2;
import yewer.mybatisplustest.domain.UserPermission3;
import yewer.mybatisplustest.mapper.UserMapper;
import yewer.mybatisplustest.service.TestService;

import java.util.ArrayList;
import java.util.HashSet;


@SpringBootTest
class MybatisPlusTestApplicationTests {

    @Autowired
    UserMapper userMapper;

    @Autowired
    TestService testService;

    @Test
    void contextLoads() {
        System.out.println(userMapper.selectPermission("yy"));
    }


    @Test
    void getUserName()
    {
        System.out.println(userMapper.selectById(1).getName());
    }

    @Test
    void getUserByName(){
        QueryWrapper<User> userWrapper = new QueryWrapper<User>();
        userWrapper.eq("name","yy");
        System.out.println(userMapper.selectOne(userWrapper));
    }

    @Test
    void testGetUserPermission(){
        UserPermission yy = userMapper.selectUserPermission("yy");
        System.out.println(yy.toString());
    }

    @Test
    void testGetUserPermission2(){
        UserPermission2 yy = userMapper.selectUserPermission2("yy");
        System.out.println(yy.toString());
    }

    @Test
    void testGetUserPermission3(){
        UserPermission3 yy = userMapper.selectUserPermission3("yy");
        System.out.println(yy.toString());
    }

    @Test
    void testGetUser(){
        System.out.println(userMapper.selectUser());
    }

    @Test
    void test01(){
        testService.test();
    }
}
