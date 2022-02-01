package com.example.swaggerfinal.controllers;



import com.example.swaggerfinal.entity.Productos;
import com.example.swaggerfinal.service.IProductosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:4200"})// ( }, )especificar
@RestController
@RequestMapping("/api/productos")

public class ProductosRestController {
    @Autowired
    private IProductosService iProductosService;

    @GetMapping("/read")
    public List<Productos> index() {
        return iProductosService.findAll();
    }

    @GetMapping("/productos/{id}")//id de aki
    public Productos show(@PathVariable Long id) {
        return iProductosService.findById(id);
    }


    @PostMapping("/create")
    @ResponseStatus (HttpStatus.CREATED)
    public  Productos saves(@RequestBody Productos productos) {
        return iProductosService.save(productos);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
        iProductosService.delete(id);
    }

    @PutMapping("/update/{id}")
    @ResponseStatus (HttpStatus.CREATED)
    public Productos update(@RequestBody Productos productos, @PathVariable Long id){
        Productos productoactual  = iProductosService.findById(id);
        productoactual.setNombre(productos.getNombre());
        productoactual.setDescripcion(productos.getDescripcion());
        productoactual.setCosto(productos.getCosto());
        productoactual.setStock(productos.getStock());

        return iProductosService.save(productoactual);
    }

}
