package kiryana.com.example.kiryana.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import kiryana.com.example.kiryana.Entity.Customer;

public interface CustomerRepository extends JpaRepository < Customer , Integer>{

}
