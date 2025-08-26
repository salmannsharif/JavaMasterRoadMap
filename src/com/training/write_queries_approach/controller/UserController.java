package com.training.write_queries_approach.controller;

/*

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/test")
public class UserController {

    private final UserService service;

    public UserController(UserService service) { this.service = service; }

    @GetMapping("/jpa/{username}")
    public User byJPA(@PathVariable String username) { return service.getByUsernameJPA(username); }

    @GetMapping("/jpql/{username}")
    public User byJPQL(@PathVariable String username) { return service.getByUsernameJPQL(username); }

    @GetMapping("/native/{username}")
    public User byNative(@PathVariable String username) { return service.getByUsernameNative(username); }

    @GetMapping("/criteria/{domain}")
    public List<User> byCriteria(@PathVariable String domain) { return service.getByCriteria(domain); }

    @GetMapping("/jdbc/{username}")
    public User byJdbc(@PathVariable String username) { return service.getByJdbc(username); }

    @GetMapping("/named/{username}")
    public User byNamed(@PathVariable String username) { return service.getByNamed(username); }

    @PostMapping("/insert")
    public Long insert(@RequestBody User user) { return service.insertSimple(user); }
}

 */