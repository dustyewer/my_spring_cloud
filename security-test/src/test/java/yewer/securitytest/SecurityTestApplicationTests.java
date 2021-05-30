package yewer.securitytest;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import yewer.securitytest.dao.RoleDao;
import yewer.securitytest.model.Role;
import yewer.securitytest.model.User;
import yewer.securitytest.service.RoleService;
import yewer.securitytest.service.UserService;

import java.util.List;

@SpringBootTest
class SecurityTestApplicationTests {

    @Autowired
    RoleService roleService;
    @Autowired
    UserService userService;

    @Test
    void contextLoads() {
        QueryWrapper<User> userQueryWrapper = new QueryWrapper<User>();
        userQueryWrapper.eq("name","yy");
        User user = userService.getOne(userQueryWrapper);

        QueryWrapper<Role> roleQueryWrapper = new QueryWrapper<Role>();
        roleQueryWrapper.in("name",user.getRole().split(","));
        List<Role> list = roleService.list(roleQueryWrapper);
        System.out.println(list);

    }

}
