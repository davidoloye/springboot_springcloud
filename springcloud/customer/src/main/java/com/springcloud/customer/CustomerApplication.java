package com.springcloud.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class CustomerApplication  {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public static void main(String[] args) {
        SpringApplication.run(CustomerApplication.class,args);
        System.out.println("Hello world!");
    }

//    @Override
//    public void run(String... args) throws Exception {
//        String sql = "INSERT INTO customer (firstName, lastName, email) values("+" 'oluwatomi', 'oloye', 'tomioloye@gmail.com')";
//        int rows = jdbcTemplate.update(sql);
//        if(rows > 0){
//            System.out.println("A new row has been inserted");
//        }
//    }
}
