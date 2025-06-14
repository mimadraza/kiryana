package kiryana.com.example.kiryana.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import kiryana.com.example.kiryana.Entity.Customer;
import kiryana.com.example.kiryana.Service.CustomerService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/user/v1")
public class CustomerController {

    private final CustomerService userService;

    @Autowired
    public CustomerController(CustomerService userService){
        this.userService = userService;
    }

    @PostMapping("/addUser")
    public ResponseEntity<Customer> addUser(@RequestBody Customer user){
        Customer savedUser = userService.addUser(user);
        return ResponseEntity.ok(savedUser);
    }
}
