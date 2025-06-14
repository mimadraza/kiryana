package kiryana.com.example.kiryana.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import kiryana.com.example.kiryana.Entity.Customer;
import kiryana.com.example.kiryana.Repository.CustomerRepository;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    CustomerService(CustomerRepository userRepository) {
        this.customerRepository = userRepository;
    }
    public Customer addUser(Customer user){
        return customerRepository.save(user);
    }
}
