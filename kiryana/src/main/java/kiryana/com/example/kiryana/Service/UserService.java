package kiryana.com.example.kiryana.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import kiryana.com.example.kiryana.Controller.UserController;
import kiryana.com.example.kiryana.Entity.User;
import kiryana.com.example.kiryana.Repository.UserRepository;

@Service
public class UserService {

    private final Controller.UserController userController;
    @Autowired
    private UserRepository userRepository;

    UserService(Controller.UserController userController) {
        this.userController = userController;
    }
    public void addUser(User user){
        return userController.save(user);
    }
}
