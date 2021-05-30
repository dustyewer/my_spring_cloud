package yewer.loadbalancetest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import yewer.loadbalancetest.model.User;


@Service
public class UserServiceImpl implements  UserService {

    @Autowired
    RestTemplate restTemplate;
    @Override
    public User getUser(Integer id) {
        return restTemplate.getForObject("http://jpa-test/service/user/"+id,User.class);
    }
}
