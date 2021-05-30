package yewer.jpatest.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import yewer.jpatest.model.User;

public interface UserDao extends JpaRepository<User,Integer> {
}
