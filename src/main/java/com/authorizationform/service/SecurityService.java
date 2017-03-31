package com.authorizationform.service;

/**
 * Created by ruslan on 31.03.17.
 */
public interface SecurityService {

    String findLoggedInUserName();

    void autoLogin(String userName, String password);
}
