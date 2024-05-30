package com.example.Quora_Backend_Application.services;
import com.example.Quora_Backend_Application.models.User;
import com.example.Quora_Backend_Application.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.UUID;

@Service
public class UserService{

    UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public User getUserById(UUID userId){
        return userRepository.findById(userId).orElse(null);
    }

    public boolean deleteUserById(UUID userId){

        if(userRepository.existsById(userId)){
            userRepository.deleteById(userId);
            return true;
        }else
            return false;

    }

    public User createUser(User user){
        return userRepository.save(user);
    }




//     @Override
//     public void  run(String... args) throws Exception{
//
//         System.out.println("Hello World");
//
//
//            User user=User.builder()
//            .bio("I am a software engineer")
//            .name("Arpit")
//            .email("arpit@gmail.com")
//            .createdAt(new Date())
//            .updatedAt(new Date())
//            .build();
//            userRepository.save(user);
//    }
}
