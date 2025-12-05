package com.hugodiazz.SupermercadoAPI.service;

import com.hugodiazz.SupermercadoAPI.dto.VentaDTO;

import java.util.List;

public interface IVentaService {
    List<VentaDTO> getVentas();
    VentaDTO createVenta(VentaDTO ventaDto);
    VentaDTO updateVenta(Long id, VentaDTO ventaDto);
    void deleteVenta(Long id);
}
