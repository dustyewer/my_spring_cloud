package yewer.securitytest.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import yewer.securitytest.entity.User;
import yewer.securitytest.dao.UserDao;
import yewer.securitytest.service.UserService;


@Service("userService")
public class UserServiceImpl extends ServiceImpl<UserDao,User> implements UserService {

}
