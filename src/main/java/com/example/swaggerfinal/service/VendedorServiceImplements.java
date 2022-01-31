package com.example.swaggerfinal.service;

import com.example.swaggerfinal.dao.IVendedorDao;
import com.example.swaggerfinal.entity.Vendedor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class VendedorServiceImplements implements IVendedorService{
    @Autowired
    private IVendedorDao iVendedorDao;

    @Override
    @Transactional(readOnly = true)
    public List<Vendedor> findAll(){
        return (List<Vendedor>) iVendedorDao.findAll();
    }
    @Override
    @Transactional(readOnly = true)
    public Vendedor findById(Long id) {

        return iVendedorDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Vendedor save(Vendedor vendedor) {

        return iVendedorDao.save(vendedor);
    }

    @Override
    @Transactional
    public void delete(Long id) {

        iVendedorDao.deleteById(id);
    }

    @Override
    @Transactional
    public Vendedor update(Vendedor vendedor, Long id) {

        return iVendedorDao.save(vendedor);
    }
}
