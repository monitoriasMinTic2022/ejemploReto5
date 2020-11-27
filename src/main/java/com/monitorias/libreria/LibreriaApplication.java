package com.monitorias.libreria;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@ComponentScan("com.monitorias.libreria")
public class LibreriaApplication {

    public static void main(String[] args) {
            SpringApplication.run(LibreriaApplication.class, args);
    }

}
