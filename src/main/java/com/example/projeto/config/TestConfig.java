package com.example.projeto.config;

import com.example.projeto.entities.User;
import com.example.projeto.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;


    @Override
    public void run(String... args) throws Exception {

        User u1 = new User(null, "Biju", "biju@gmail.com", "123123123", "password");
        User u2 = new User(null, "Guilherme", "gui@gmail.com", "321123123", "password");
        User u3 = new User(null,"Malu","malu@gmail.com","12341234","malu123");
        userRepository.saveAll(Arrays.asList(u1, u2,u3));

    }
}
