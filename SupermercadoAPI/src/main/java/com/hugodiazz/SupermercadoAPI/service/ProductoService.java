package com.hugodiazz.SupermercadoAPI.service;

import com.hugodiazz.SupermercadoAPI.dto.ProductoDTO;
import com.hugodiazz.SupermercadoAPI.exception.NotFoundException;
import com.hugodiazz.SupermercadoAPI.mapper.Mapper;
import com.hugodiazz.SupermercadoAPI.model.Producto;
import com.hugodiazz.SupermercadoAPI.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService implements IProductoService{
    @Autowired
    private ProductoRepository repo;

    @Override
    public List<ProductoDTO> getProductos() {
        return repo.findAll().stream().map(Mapper::toProductoDTO).toList();
    }

    @Override
    public ProductoDTO createProducto(ProductoDTO productoDto) {
        Producto prod = Producto.builder()
                .nombre(productoDto.getNombre())
                .categoria(productoDto.getCategoria())
                .precio(productoDto.getPrecio())
                .build();

        return Mapper.toProductoDTO(repo.save(prod));
    }

    @Override
    public ProductoDTO updateProducto(Long id, ProductoDTO productoDto) {
        Producto prod = repo.findById(id)
                .orElseThrow(() -> new NotFoundException("Producto no encontrado"));


    }

    @Override
    public void deleteProducto(Long id) {

    }
}
