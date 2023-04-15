package com.mu.service;

import com.mu.User;
import com.mu.UserRequest;
import com.mu.UserService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService
public class UserServiceImpl implements UserService {

    @Override
    public User getUser(UserRequest request) {
        return User.newBuilder().setUid("1").setUsername("zhouyu").build();
    }
}
