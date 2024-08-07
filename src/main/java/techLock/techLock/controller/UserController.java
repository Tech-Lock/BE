package techLock.techLock.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import techLock.techLock.entity.User;
import techLock.techLock.service.UserService;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> userList() {
        return userService.findAll();
    }

    @PostMapping("/users/signup")
    public String registerUser(@RequestBody User user) {
        return userService.join(user);
    }

    @PostMapping("/users/login")
    public String loginUser(@RequestBody User user) {
        return userService.login(user);
    }
}
