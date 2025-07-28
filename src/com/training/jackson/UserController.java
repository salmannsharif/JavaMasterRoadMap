package com.training.jackson;

//import org.springframework.web.bind.annotation.*;

//@RestController
//@RequestMapping("/api")
public class UserController {

//    @PostMapping("/user")
//    public String createUser(@RequestBody User user) {
        // Jackson automatically converts JSON to User object
//        return "Received user: " + user.getName() + ", age: " + user.getAge();
//    }

//    @GetMapping("/user")
    public User getUser() {
        // Jackson automatically converts User object to JSON
        User user = new User();
        user.setName("Salman");
        user.setAge(24);
        return user;
    }
}

/**
 * 🔁 Behind the scenes, Spring Boot uses Jackson to:
 * 
 * 1. Deserialize: JSON → Java Object (@RequestBody)
 * 2. Serialize: Java Object → JSON (@ResponseBody or return object in @RestController)
 */
