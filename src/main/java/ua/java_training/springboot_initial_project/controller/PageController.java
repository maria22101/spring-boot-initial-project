package ua.java_training.springboot_initial_project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping("/")
    public String welcomeAll() {
        return "start-page";
    }

    @RequestMapping("/admin")
    public String welcomeAdmin() {
        return "hello-admin";
    }

    @RequestMapping("/user")
    public String welcomeUser() {
        return "hello-user";
    }
}
