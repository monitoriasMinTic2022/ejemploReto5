
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

@Component
public class Corredor implements CommandLineRunner {

    @Autowired
    private ClienteRepo repo;

    @Override
    public void run(String... args) throws Exception {
        
        /*
        Cliente prueba = new Cliente();
        prueba.setNombres("William Rodríguez");
        prueba.setEmail("wiarodriguezmo@unal.edu.co");
        repo.save(prueba);
        
        if(repo.existsById(2L))
            repo.deleteById(2L);
        System.out.println("Total Clientes: " + repo.count());
        
        Optional<Cliente> nuevoClienteEnvuelto = repo.findById(1L);
        Cliente clienteDesenv;
        if(nuevoClienteEnvuelto.isPresent()){
            clienteDesenv = nuevoClienteEnvuelto.get();
            System.out.println("Su nombre es: " + clienteDesenv.getNombres());
            clienteDesenv.setNombres("Juan Alberto");
            repo.save(clienteDesenv);
        }
        Optional<Cliente> aEliminar = repo.findById(5L);
        if(aEliminar.isPresent())
            repo.delete(aEliminar.get());
        
        
        Cliente uno = new Cliente();
        uno.setNombres("Cualquiera a eliminar");
        repo.save(uno);

        //repo.delete(uno);
        Long l = 17L;
        boolean existe = repo.existsById(l);
        if(existe)
            System.out.println("Existe!!");

        
        Optional<Cliente> clienteDieci = repo.findById(1L);
 
        System.out.println(clienteDieci.toString());
        if(clienteDieci.isPresent()){
            System.out.println("Está!!");
            Cliente obtenido = clienteDieci.get();
            System.out.println("Nombre: " + obtenido.getNombres());
            obtenido.setNombres("SOy un nuevo nombre");
            repo.save(obtenido);
        }
        
        System.out.println("Cantidad: " + repo.count());
       */
    }
}