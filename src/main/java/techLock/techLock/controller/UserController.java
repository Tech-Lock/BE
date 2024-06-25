package techLock.techLock.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import techLock.techLock.entity.User;
import techLock.techLock.service.UserService;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/users/signup")
    public ResponseEntity<String> registerUser(@RequestBody User user) {
        String msg = userService.join(user);
        return new ResponseEntity<String>(msg, HttpStatus.OK);
    }

    @PostMapping("/users/login")
    public ResponseEntity<String> loginUser(@RequestBody User user) {
        String msg = userService.login(user);
        return new ResponseEntity<String>(msg, HttpStatus.OK);
    }
}
