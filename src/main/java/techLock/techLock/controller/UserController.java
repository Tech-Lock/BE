package techLock.techLock.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import techLock.techLock.entity.User;
import techLock.techLock.service.UserService;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/users/signup")
    public String registerUser(@RequestBody User user) {
        return userService.join(user);
    }

    @PostMapping("/users/login")
    public String loginUser(@RequestBody User user) {
        return userService.login(user);
    }
}
