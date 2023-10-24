package com.mussoriecodebuffer.springbootdemo.controller;

import com.mussoriecodebuffer.springbootdemo.MODEL.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String Home() {
        return "Hello World";
    }

    //@RequestMapping(value = "/user", method = RequestMethod.GET)
    @GetMapping("/user")
    public User user() {
        User user = new User();
        user.setId("1");
        user.setName("Shikha Kanojiya");
        user.setEmailId("shikha@gmail.com");

        return user;

    }

    @GetMapping("/{id}/{id2}")
    public String pathVariable(@PathVariable String id, @PathVariable("id2") String name) {
        return "The path variable is:" + id + ":" + name;
    }
    @GetMapping("/requestParam")
    public String requestParams(@RequestParam String name, @RequestParam(name = "email", required = false, defaultValue = "") String emailId) {
        return "your name is :" + name + " and email id is:" +emailId;

    }
}
