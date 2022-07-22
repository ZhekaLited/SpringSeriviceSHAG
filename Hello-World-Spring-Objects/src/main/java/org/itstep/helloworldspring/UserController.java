package org.itstep.helloworldspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserServes userServes;

    @RequestMapping("/")
    public String Hello() {
        return "Hello World";
    }

    @RequestMapping("/users")
    public List<User> getUsers() {
        return userServes.getUsers();
    }

    @RequestMapping("/users/{id}")
    public User getUsersById(@PathVariable Long id) {
        return userServes.getUserById(id);
    }

    @RequestMapping("/user")
    public User getUsersById2(@RequestParam(name = "id") Long id) {
        return userServes.getUserById(id);
    }
}