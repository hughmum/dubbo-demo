package com.mu;

import org.apache.dubbo.common.stream.StreamObserver;

public interface UserService {

    // UNARY
    public String getUser();

    // SERVER_STREAM
    default void sayHelloServerStream(String name, StreamObserver<String> response) {
    }

    // CLIENT_STREAM / BI_STREAM
    default StreamObserver<String> sayHelloStream(StreamObserver<String> response) {
        return response;
    }
}
