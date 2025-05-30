package com.cajero.BancoAleja.repository;

import java.util.Optional;
import com.cajero.BancoAleja.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    Optional<Cliente> findByIdentificacion(String identificacion);
    

}