package com.chatBot.springboot.Service;
import com.chatBot.springboot.Entity.User;
import com.chatBot.springboot.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // Method to save a user
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    // Method to update a user
    public User updateUser(User user) {
        return userRepository.save(user);
    }

    // Method to delete a user by ID
    public void deleteUser(String userId) {
        userRepository.deleteById(userId);
    }

    // Method to retrieve all users
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
    public Optional<User> getUserById(String userId) {
        return userRepository.findById(userId);
    }


}
