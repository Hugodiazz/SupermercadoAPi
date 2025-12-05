package com.hugodiazz.SupermercadoAPI.service;

import com.hugodiazz.SupermercadoAPI.dto.ProductoDTO;

import java.util.List;

public interface IProductoService {
    List<ProductoDTO> getProductos();
    ProductoDTO createProducto(ProductoDTO productoDto);
    ProductoDTO updateProducto(Long id, ProductoDTO productoDto);
    void deleteProducto(Long id);
}
