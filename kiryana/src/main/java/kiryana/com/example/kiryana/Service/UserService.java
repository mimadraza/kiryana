package kiryana.com.example.kiryana.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import kiryana.com.example.kiryana.Entity.User;
import kiryana.com.example.kiryana.Repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public User addUser(User user){
        return userRepository.save(user);
    }
}
