package simple.code.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RequestMapping("/kube")
@RestController
public class MyRestController {

    @GetMapping("/method1")
    public String myMethod()
    {
        return String.format("Hello from method1 @ "+new Date());
    }

    @GetMapping("/method2")
    public String myMethod2()
    {
        return String.format("Hello from method2 @ "+new Date());
    }
}
