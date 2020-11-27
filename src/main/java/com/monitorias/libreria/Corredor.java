
package com.monitorias.libreria;

import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import com.monitorias.libreria.modelos.Cliente;
import com.monitorias.libreria.repos.*;
/**
 *
 * @author clases
 */

@Component
public class Corredor implements CommandLineRunner {

    @Autowired
    private ClienteRepo repo;

    @Override
    public void run(String... args) throws Exception {
        Cliente uno = new Cliente();
        uno.setNombres("Cualquiera2");

        repo.save(uno);
        System.out.println("asdasd");
    }
}