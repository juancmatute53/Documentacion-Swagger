package com.example.swaggerfinal.service;


import com.example.swaggerfinal.entity.Cliente;

import java.util.List;

public interface IClienteService {
    public List<Cliente> findAll();

    public Cliente findById(Long id);

    public Cliente save(Cliente cliente);

    public void delete(Long id);

    public Cliente update(Cliente cliente,Long id);

}


