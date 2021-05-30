package yewer.jpatest;

import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.core.AutoConfigureCache;
import org.springframework.boot.test.context.SpringBootTest;
import yewer.jpatest.dao.UserDao;
import yewer.jpatest.service.UserService;

@SpringBootTest
class JpaTestApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	UserDao userDao;

	@Autowired
	UserService userService;

	@Test
	void test(){
		System.out.println(userDao.getOne(1).getName());
	}

	@Test
	void test01(){
		System.out.println(userService.myGetUser("y"));
	}


}
