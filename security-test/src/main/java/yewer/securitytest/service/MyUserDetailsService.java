package yewer.securitytest.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import yewer.securitytest.entity.Role;
import yewer.securitytest.entity.User;
import yewer.securitytest.model.Role;
import yewer.securitytest.model.User;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    UserService userService;

    @Autowired
    RoleService roleService;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        QueryWrapper<User> userQueryWrapper= new QueryWrapper<>();
        userQueryWrapper.eq("name",s);
        User user = userService.getOne(userQueryWrapper);
        System.out.println(user.getPassword());

        QueryWrapper<Role> roleQueryWrapper = new QueryWrapper<Role>();
        roleQueryWrapper.in("name",user.getRole().split(","));
        List<Role> roleList = roleService.list(roleQueryWrapper);
        String permissions = roleList.stream().map(role -> role.getPermission()).collect(Collectors.joining(","));

        UserDetails userDetails=org.springframework.security.core.userdetails.User
                .withUsername(s).password(user.getPassword()).authorities(Arrays.stream(permissions.split(",")).distinct().toArray(String[]::new))
                .build();
        return userDetails;
    }
}
