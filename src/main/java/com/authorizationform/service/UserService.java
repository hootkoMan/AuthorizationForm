package com.authorizationform.service;

import com.authorizationform.model.User;

/**
 * Created by ruslan on 31.03.17.
 */
public interface UserService {

    void save(User user);

    User findByUserName(String userName);
}
