package com.hugodiazz.SupermercadoAPI.mapper;

import com.hugodiazz.SupermercadoAPI.dto.DetalleVentaDTO;
import com.hugodiazz.SupermercadoAPI.dto.ProductoDTO;
import com.hugodiazz.SupermercadoAPI.dto.SucursalDTO;
import com.hugodiazz.SupermercadoAPI.dto.VentaDTO;
import com.hugodiazz.SupermercadoAPI.model.Producto;
import com.hugodiazz.SupermercadoAPI.model.Sucursal;
import com.hugodiazz.SupermercadoAPI.model.Venta;

import java.util.stream.Collectors;

public class Mapper {

    //Mapeo de producto a ProductoDTO
    public static ProductoDTO toProductoDTO(Producto producto) {
        if (producto == null) return null;

        return ProductoDTO.builder()
                .id(producto.getId())
                .nombre(producto.getNombre())
                .categoria(producto.getCategoria())
                .precio(producto.getPrecio())
                .build();
    }

    //Mapeo de Venta a VentaDTO
    public static VentaDTO toVentaDTO(Venta venta) {
        if (venta == null) return null;

        var detalle = venta.getDetalle().stream().map(det ->
                DetalleVentaDTO.builder()
                        .id(det.getProducto().getId())
                        .nombreProducto(det.getProducto().getNombre())
                        .cantProducto(det.getCantProd())
                        .precio(det.getPrecio())
                        .subtotal(det.getPrecio() * det.getCantProd())
                        .build()
        ).collect(Collectors.toList());

        var total = detalle.stream()
                .map(DetalleVentaDTO::getSubtotal)
                .reduce(0.0, Double::sum);

        return VentaDTO.builder()
                .id(venta.getId())
                .fecha(venta.getFecha())
                .idSucursal(venta.getSucursal().getId())
                .estado(venta.getEstado())
                .detalle(detalle)
                .total(total)
                .build();

    }
    //Mapeo de Sucursal a SucursalDTO
    public static SucursalDTO toSucursalDTO(Sucursal sucursal) {
        if (sucursal == null) return null;

        return SucursalDTO.builder()
                .id(sucursal.getId())
                .nombre(sucursal.getNombre())
                .direccion(sucursal.getDireccion())
                .build();
    }
}
