package com.example.swaggerfinal.controllers;



import com.example.swaggerfinal.entity.Empleado;
import com.example.swaggerfinal.service.IEmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:4200"})// ( }, )especificar
@RestController
@RequestMapping("/api/empleados")

public class EmpleadoRestController {
    @Autowired
    private IEmpleadoService iEmpleadoService;

    @GetMapping("/read")
    public List<Empleado> index() {
        return iEmpleadoService.findAll();
    }

    @GetMapping("/empleados/{id}")//id de aki
    public Empleado show(@PathVariable Long id) {
        return iEmpleadoService.findById(id);
    }


    @PostMapping("/create")
    @ResponseStatus (HttpStatus.CREATED)
    public  Empleado saves(@RequestBody Empleado empleado) {
        return iEmpleadoService.save(empleado);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
        iEmpleadoService.delete(id);
    }

    @PutMapping("/update/{id}")
    @ResponseStatus (HttpStatus.CREATED)
    public Empleado update(@RequestBody Empleado empleado, @PathVariable Long id){
        Empleado empleadoactual  = iEmpleadoService.findById(id);
        empleadoactual.setNombre(empleado.getNombre());
        empleadoactual.setApellido(empleado.getApellido());
        empleadoactual.setCi(empleado.getCi());
        empleadoactual.setFecha_n(empleado.getFecha_n());
        empleadoactual.setSexo(empleado.getSexo());
        empleadoactual.setSalario(empleado.getSalario());
        empleadoactual.setSuperci(empleado.getSuperci());
        empleadoactual.setDno(empleado.getDno());

        return iEmpleadoService.save(empleadoactual);
    }

}
