package com.example.swaggerfinal.controllers;



import com.example.swaggerfinal.entity.Vendedor;
import com.example.swaggerfinal.service.IVendedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:4200"})// ( }, )especificar
@RestController
@RequestMapping("/api/vendedor")

public class VendedorRestController {
    @Autowired
    private IVendedorService iVendedorService;

    @GetMapping("/read")
    public List<Vendedor> index() {
        return iVendedorService.findAll();
    }

    @GetMapping("/vendedor/{id}")//id de aki
    public Vendedor show(@PathVariable Long id) {
        return iVendedorService.findById(id);
    }


    @PostMapping("/create")
    @ResponseStatus (HttpStatus.CREATED)
    public  Vendedor saves(@RequestBody Vendedor vendedor) {
        return iVendedorService.save(vendedor);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
        iVendedorService.delete(id);
    }

    @PutMapping("/update/{id}")
    @ResponseStatus (HttpStatus.CREATED)
    public Vendedor update(@RequestBody Vendedor vendedor, @PathVariable Long id){
        Vendedor vendedoractual  = iVendedorService.findById(id);
        vendedoractual.setNombre(vendedor.getNombre());
        vendedoractual.setApellido(vendedor.getApellido());
        vendedoractual.setDireccion(vendedor.getDireccion());
        vendedoractual.setTelefono(vendedor.getTelefono());
        vendedoractual.setEmail(vendedor.getEmail());
        return iVendedorService.save(vendedoractual);
    }

}
