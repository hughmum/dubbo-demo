package com.mu;

import java.util.concurrent.CompletableFuture;

public interface UserService {

    static final String JAVA_SERVICE_NAME = "com.zhouyu.UserService";
    static final String SERVICE_NAME = "api.UserService";

    static final boolean inited = UserServiceDubbo.init();

    com.mu.User getUser(com.mu.UserRequest request);

    default CompletableFuture<com.mu.User> getUserAsync(com.mu.UserRequest request){
        return CompletableFuture.supplyAsync(() -> getUser(request));
    }




}
