package com.hugodiazz.SupermercadoAPI.repository;

import com.hugodiazz.SupermercadoAPI.model.Venta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VentaRepository extends JpaRepository<Venta,Long> {
}
