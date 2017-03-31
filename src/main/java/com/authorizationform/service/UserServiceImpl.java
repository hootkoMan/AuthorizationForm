package com.authorizationform.service;

import com.authorizationform.dao.RoleDao;
import com.authorizationform.dao.UserDao;
import com.authorizationform.model.Role;
import com.authorizationform.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * Implementation of {@link UserService} interface.
 * <p>
 * Created by ruslan on 31.03.17.
 */
@Service
public class UserServiceImpl implements UserService {

    public static final Long ROLE_USER_ID = 1L;
    public static final Long ROLE_ADMIN_ID = 2L;

    @Autowired
    private UserDao userDao;

    @Autowired
    private RoleDao roleDao;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public void save(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        Set<Role> roles = new HashSet<>();
        roles.add(roleDao.getOne(ROLE_USER_ID));
        user.setRoles(roles);
        userDao.save(user);
    }

    @Override
    public User findByUserName(String userName) {
        return userDao.findByUserName(userName);
    }
}
