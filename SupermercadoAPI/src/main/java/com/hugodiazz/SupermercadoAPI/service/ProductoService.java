package com.hugodiazz.SupermercadoAPI.service;

import com.hugodiazz.SupermercadoAPI.dto.ProductoDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService implements IProductoService{
    @Override
    public List<ProductoDTO> getProductos() {
        return List.of();
    }

    @Override
    public ProductoDTO createProducto(ProductoDTO productoDto) {
        return null;
    }

    @Override
    public ProductoDTO updateProducto(Long id, ProductoDTO productoDto) {
        return null;
    }

    @Override
    public void deleteProducto(Long id) {

    }
}
