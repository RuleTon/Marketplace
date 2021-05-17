package com.example.eureka_feign;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequiredArgsConstructor
@RestController
public class GrettingController {
    private  final GreetingClient greetingClient;

    @RequestMapping("/get-greeting")
    public String greeting() {
        System.out.println(greetingClient.getClass().getName());
        String answer = greetingClient.greeting();
        answer = greetingClient.parametrized("1000");
        return answer;
    }
}
