package com.example.swaggerfinal.dao;


import com.example.swaggerfinal.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface IClienteDao extends CrudRepository<Cliente,Long> {
}
