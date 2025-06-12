package kiryana.com.example.kiryana.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import kiryana.com.example.kiryana.Entity.User;

public interface UserRepository extends JpaRepository < User , Integer>{

}
