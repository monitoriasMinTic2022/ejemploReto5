package com.monitorias.libreria.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.monitorias.libreria.modelos.*;

@Repository
public interface ClienteRepo extends JpaRepository<Cliente, Long> {
    
}
