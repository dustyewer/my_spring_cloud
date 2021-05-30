package yewer.mybatisplustest.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import org.springframework.stereotype.Service;
import yewer.mybatisplustest.domain.User;
import yewer.mybatisplustest.mapper.UserMapper;
import yewer.mybatisplustest.service.UserService;

/**
 *
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
implements UserService {

}




