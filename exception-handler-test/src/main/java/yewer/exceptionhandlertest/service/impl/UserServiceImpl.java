package yewer.exceptionhandlertest.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import yewer.exceptionhandlertest.model.User;
import yewer.exceptionhandlertest.service.UserService;
import yewer.exceptionhandlertest.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
 *
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
implements UserService{

}




