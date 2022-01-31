package com.example.swaggerfinal.dao;

import com.example.swaggerfinal.entity.Vendedor;
import org.springframework.data.repository.CrudRepository;

public interface IVendedorDao extends CrudRepository<Vendedor,Long> {
}
