package mu.service;

import com.mu.UserService;
import org.apache.dubbo.common.stream.StreamObserver;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @DubboReference(version = "1.0")
    private UserService userService;

    public String getOrder() {
        // unary
//        String user = userService.getUser();

        StreamObserver<String> streamObserver = userService.sayHelloStream(new StreamObserver<String>() {
            @Override
            public void onNext(String data) {
                System.out.println(data);
            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onCompleted() {

            }
        });

        streamObserver.onNext("1");
        streamObserver.onNext("2");
        streamObserver.onNext("2");
        streamObserver.onCompleted();


        return "succes";
    }
}
