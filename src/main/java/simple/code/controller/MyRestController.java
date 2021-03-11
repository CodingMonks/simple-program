package simple.code.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import simple.code.CodingMonksK8Application;

import java.util.Date;

@RequestMapping("/kube")
@RestController
public class MyRestController {
    private final Logger logger = LogManager.getLogger(MyRestController.class);

    @GetMapping("/method1")
    public String myMethod()
    {
        Date date = new Date();
        logger.info("myMethod1 "+date);

        return String.format("Hello from method1 @ "+date);
    }

    @GetMapping("/method2")
    public String myMethod2()
    {
        Date date = new Date();
        logger.info("myMethod2 "+date);
        return String.format("Hello from method2 @ "+date);
    }
}
