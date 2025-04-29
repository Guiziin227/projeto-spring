package com.example.projeto.config;

import com.example.projeto.entities.Category;
import com.example.projeto.entities.Order;
import com.example.projeto.entities.OrderItem;
import com.example.projeto.entities.Payment;
import com.example.projeto.entities.Product;
import com.example.projeto.entities.User;
import com.example.projeto.entities.enums.OrderStatus;
import com.example.projeto.repositories.CategoryRepository;
import com.example.projeto.repositories.OrderItemRepository;
import com.example.projeto.repositories.OrderRepository;
import com.example.projeto.repositories.ProductRepository;
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

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private OrderItemRepository orderItemRepository;


    @Override
    public void run(String... args) throws Exception {

        Category cat1 = new Category(null, "Eletronics");
        Category cat2 = new Category(null, "Books");
        Category cat3 = new Category(null, "Computers");
        categoryRepository.saveAll(Arrays.asList(cat1,cat2,cat3));

        Product p1 = new Product(null, "The Lord of the Rings", "Lorem ipsum dolor sit amet, consectetur.", 90.5, "");
        Product p2 = new Product(null, "Smart TV", "Nulla eu imperdiet purus. Maecenas ante.", 2190.0, "");
        Product p3 = new Product(null, "Macbook Pro", "Nam eleifend maximus tortor, at mollis.", 1250.0, "");
        Product p4 = new Product(null, "PC Gamer", "Donec aliquet odio ac rhoncus cursus.", 1200.0, "");
        Product p5 = new Product(null, "Rails for Dummies", "Cras fringilla convallis sem vel faucibus.", 100.99, "");
        productRepository.saveAll(Arrays.asList(p1,p2,p3,p4,p5));

        p1.getCategories().add(cat2);
        p2.getCategories().add(cat1);
        p2.getCategories().add(cat3);
        p3.getCategories().add(cat3);
        p4.getCategories().add(cat3);
        p5.getCategories().add(cat2);

        productRepository.saveAll(Arrays.asList(p1,p2,p3,p4,p5));

        User u1 = new User(null, "Biju", "biju@gmail.com", "123123123", "password");
        User u2 = new User(null, "Guilherme", "gui@gmail.com", "321123123", "password");
        User u3 = new User(null,"Malu","malu@gmail.com","12341234","malu123");
        userRepository.saveAll(Arrays.asList(u1, u2,u3));

        Order o1 = new Order(null, Instant.parse("2025-03-12T12:02:23Z"), OrderStatus.PAID, u1);
        Order o2 = new Order(null, Instant.parse("2025-02-12T13:04:23Z"),OrderStatus.DELIVERED, u2);
        Order o3 = new Order(null, Instant.parse("2025-01-15T15:05:33Z"),OrderStatus.WAITING_PAYMENT, u1);
        Order o4 = new Order(null, Instant.parse("2025-03-22T18:10:23Z"),OrderStatus.DELIVERED, u3);
        orderRepository.saveAll(Arrays.asList(o1, o2, o3, o4));


        OrderItem oi1 = new OrderItem(o1, p1, 2, p1.getPrice());
        OrderItem oi2 = new OrderItem(o1, p3, 1, p3.getPrice());
        OrderItem oi3 = new OrderItem(o2, p3, 2, p3.getPrice());
        OrderItem oi4 = new OrderItem(o3, p5, 2, p5.getPrice());
        orderItemRepository.saveAll(Arrays.asList(oi1,oi2,oi3,oi4));

        Payment pay1 = new Payment(null, Instant.parse("2025-03-12T14:02:23Z"), o1);
        o1.setPayment(pay1); //classe dependente nao precisa do repositorio
        orderRepository.save(o1);
    }
}
