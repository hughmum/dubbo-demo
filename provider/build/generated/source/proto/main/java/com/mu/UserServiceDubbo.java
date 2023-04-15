    package com.mu;

import java.util.concurrent.atomic.AtomicBoolean;

public final class UserServiceDubbo {
private static final AtomicBoolean registered = new AtomicBoolean();

public static boolean init() {
    if (registered.compareAndSet(false, true)) {
            org.apache.dubbo.rpc.protocol.tri.SingleProtobufUtils.marshaller(
            com.mu.User.getDefaultInstance());
            org.apache.dubbo.rpc.protocol.tri.SingleProtobufUtils.marshaller(
            com.mu.UserRequest.getDefaultInstance());
    }
    return true;
}

private UserServiceDubbo() {}

}
