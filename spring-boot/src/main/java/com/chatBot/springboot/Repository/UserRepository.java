package com.chatBot.springboot.Repository;

import com.chatBot.springboot.Entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
    // Add custom query methods here if needed
}
