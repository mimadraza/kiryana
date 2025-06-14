package kiryana.com.example.kiryana.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import kiryana.com.example.kiryana.Entity.User;
import kiryana.com.example.kiryana.Service.UserService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/user/v1")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping("/addUser")
    public ResponseEntity addUser(User user){
        User savedUser = userService.addUser(user);
        return ResponseEntity.ok(savedUser);
    }
}
