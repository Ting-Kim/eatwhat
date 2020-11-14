package food.recommand.eatwhat.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j // 확인
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
}
