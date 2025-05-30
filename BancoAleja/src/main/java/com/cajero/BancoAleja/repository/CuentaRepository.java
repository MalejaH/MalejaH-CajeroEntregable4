package com.cajero.BancoAleja.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

import com.cajero.BancoAleja.entity.Cliente;
import com.cajero.BancoAleja.entity.Cuenta;
import java.util.Optional;


public interface CuentaRepository extends JpaRepository<Cuenta , Long> {
    Optional<Cuenta> findByNumero(String numero);
    List<Cuenta> findByCliente(Cliente cliente);

}