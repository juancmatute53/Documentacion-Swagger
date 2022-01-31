package com.example.swaggerfinal.dao;

import com.example.swaggerfinal.entity.Empleado;
import org.springframework.data.repository.CrudRepository;

public interface IEmpleadoDao extends CrudRepository<Empleado,Long> {
}

