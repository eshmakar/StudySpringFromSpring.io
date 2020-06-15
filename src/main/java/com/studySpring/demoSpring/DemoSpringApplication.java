package com.studySpring.demoSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoSpringApplication.class, args);
    }

    //при открытии http://localhost:8080/hello выведет сообщение Hello World!
    //а если добавить в конце: http://localhost:8080/hello?name=Marat выведет Hello Marat!
    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name){
    	return String.format("Hello %s!", name);
	}
}
