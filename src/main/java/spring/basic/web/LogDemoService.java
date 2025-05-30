package spring.basic.web;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import spring.basic.common.MyLogger;

@Service
@RequiredArgsConstructor
public class LogDemoService {

    private final MyLogger myLogger;

    public void logic(String id) {
       // MyLogger myLogger = myLoggerProvider.getObject();
        myLogger.log("service id = " + id);
    }
}
