package com.example.swaggerfinal.dao;

import com.example.swaggerfinal.entity.Productos;
import org.springframework.data.repository.CrudRepository;

public interface IProductosDao extends CrudRepository<Productos,Long> {
}
