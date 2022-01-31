package com.example.swaggerfinal.service;

import com.example.swaggerfinal.entity.Empleado;

import java.util.List;

public interface IEmpleadoService {

    public List<Empleado> findAll();

    public Empleado findById(Long id);

    public Empleado save(Empleado empleado);

    public void delete(Long id);

    public Empleado update(Empleado empleado,Long id);
}
