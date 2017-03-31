package com.authorizationform.dao;

import com.authorizationform.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by ruslan on 31.03.17.
 */
public interface UserDao extends JpaRepository<User, Long> {
    User findByUserName(String userName);
}
