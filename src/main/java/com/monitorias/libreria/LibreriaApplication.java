package com.monitorias.libreria;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.monitorias.libreria.vistas.GraficoCRUD;
import com.monitorias.libreria.vistas.Ventana;

@SpringBootApplication
@ComponentScan("com.monitorias.libreria")
public class LibreriaApplication {

    public static void main(String[] args) {     
        Ventana interfaz = new Ventana();
        interfaz.setVisible(true);
    }
    
    public static void runSpringServer(String[] args) {
        SpringApplication.run(LibreriaApplication.class, args);
    }

}
