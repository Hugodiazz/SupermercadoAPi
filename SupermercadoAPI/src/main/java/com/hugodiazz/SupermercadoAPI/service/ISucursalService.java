package com.hugodiazz.SupermercadoAPI.service;

import com.hugodiazz.SupermercadoAPI.dto.SucursalDTO;
import com.hugodiazz.SupermercadoAPI.model.Sucursal;

import java.util.List;

public interface ISucursalService {

    List<SucursalDTO> getSucursales();
    SucursalDTO createSucursal(SucursalDTO sucursalDto);
    SucursalDTO updateSucursal(Long id, SucursalDTO sucursalDto);
    void deleteSucursal(Long id);

}
