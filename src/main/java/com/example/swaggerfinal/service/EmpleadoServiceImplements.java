package com.example.swaggerfinal.service;

import com.example.swaggerfinal.dao.IEmpleadoDao;
import com.example.swaggerfinal.entity.Empleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmpleadoServiceImplements implements IEmpleadoService{
    @Autowired
    private IEmpleadoDao iEmpleadoDao;

    @Override
    @Transactional(readOnly = true)
    public List<Empleado> findAll(){
        return (List<Empleado>) iEmpleadoDao.findAll();
    }
    @Override
    @Transactional(readOnly = true)
    public Empleado findById(Long id) {

        return iEmpleadoDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Empleado save(Empleado empleado) {

        return iEmpleadoDao.save(empleado);
    }

    @Override
    @Transactional
    public void delete(Long id) {

        iEmpleadoDao.deleteById(id);
    }

    @Override
    @Transactional
    public Empleado update(Empleado empleado, Long id) {

        return iEmpleadoDao.save(empleado);
    }
}
