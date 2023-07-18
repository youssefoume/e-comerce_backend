package com.example.ecomerce;

import com.example.ecomerce.entity.User;
import com.example.ecomerce.security.RsaKeysConfig;
import com.example.ecomerce.service.impl.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
@EnableConfigurationProperties(RsaKeysConfig.class)
public class EcomerceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EcomerceApplication.class, args);
    }
    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
    @Bean
    CommandLineRunner run(UserService userService){
        return args -> {
           User user = new User();
              user.setUsername("admin");
                user.setPassword("admin");
                user.setEmail("admin@gmail.com");
                user.setRole("ROLE_ADMIN");
                userService.saveUser(user);
        };
    }
}
