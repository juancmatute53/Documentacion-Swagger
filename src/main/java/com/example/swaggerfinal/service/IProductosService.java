package com.example.swaggerfinal.service;

import com.example.swaggerfinal.entity.Productos;

import java.util.List;

public interface IProductosService {

    public List<Productos> findAll();

    public Productos findById(Long id);

    public Productos save(Productos productos);

    public void delete(Long id);

    public Productos update(Productos productos,Long id);
}
