package com.cajero.BancoAleja.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import com.cajero.BancoAleja.entity.Cuenta;
import com.cajero.BancoAleja.entity.Movimiento;

public interface MovimientoRepository extends JpaRepository<Movimiento, Long> {
   List<Movimiento> findByCuenta(Cuenta cuenta);
   List<Movimiento> findByCuentaOrderByFechaDesc(Cuenta cuenta);

}