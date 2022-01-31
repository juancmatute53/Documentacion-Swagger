package com.example.swaggerfinal.service;


import com.example.swaggerfinal.dao.IProductosDao;
import com.example.swaggerfinal.entity.Productos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductosServiceImplements implements IProductosService{
    @Autowired
    private IProductosDao iProductosDao;

    @Override
    @Transactional(readOnly = true)
    public List<Productos> findAll(){
        return (List<Productos>) iProductosDao.findAll();
    }
    @Override
    @Transactional(readOnly = true)
    public Productos findById(Long id) {

        return iProductosDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Productos save(Productos productos) {

        return iProductosDao.save(productos);
    }

    @Override
    @Transactional
    public void delete(Long id) {

        iProductosDao.deleteById(id);
    }

    @Override
    @Transactional
    public Productos update(Productos productos, Long id) {

        return iProductosDao.save(productos);
    }
}
