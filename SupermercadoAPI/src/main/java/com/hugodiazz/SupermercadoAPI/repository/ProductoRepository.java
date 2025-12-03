package com.hugodiazz.SupermercadoAPI.repository;

import com.hugodiazz.SupermercadoAPI.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
