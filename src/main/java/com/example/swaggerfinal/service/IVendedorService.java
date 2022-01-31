package com.example.swaggerfinal.service;

import com.example.swaggerfinal.entity.Vendedor;

import java.util.List;

public interface IVendedorService {

    public List<Vendedor> findAll();

    public Vendedor findById(Long id);

    public Vendedor save(Vendedor vendedor);

    public void delete(Long id);

    public Vendedor update(Vendedor vendedor,Long id);
}
