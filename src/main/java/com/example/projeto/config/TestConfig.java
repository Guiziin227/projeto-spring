package com.example.projeto.config;

import com.example.projeto.entities.Order;
import com.example.projeto.entities.User;
import com.example.projeto.entities.enums.OrderStatus;
import com.example.projeto.repositories.OrderRepository;
import com.example.projeto.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;


    @Override
    public void run(String... args) throws Exception {

        User u1 = new User(null, "Biju", "biju@gmail.com", "123123123", "password");
        User u2 = new User(null, "Guilherme", "gui@gmail.com", "321123123", "password");
        User u3 = new User(null,"Malu","malu@gmail.com","12341234","malu123");
        userRepository.saveAll(Arrays.asList(u1, u2,u3));

        Order o1 = new Order(null, Instant.parse("2025-03-12T12:02:23Z"), OrderStatus.PAID, u1);
        Order o2 = new Order(null, Instant.parse("2025-02-12T13:04:23Z"),OrderStatus.DELIVERED, u2);
        Order o3 = new Order(null, Instant.parse("2025-01-15T15:05:33Z"),OrderStatus.WAITING_PAYMENT, u1);
        Order o4 = new Order(null, Instant.parse("2025-03-22T18:10:23Z"),OrderStatus.DELIVERED, u3);
        orderRepository.saveAll(Arrays.asList(o1, o2, o3, o4));
    }
}
