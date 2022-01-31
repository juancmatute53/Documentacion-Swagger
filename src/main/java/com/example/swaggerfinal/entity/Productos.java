package com.example.swaggerfinal.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "productos")
public class Productos implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id_Producto;
    private String nombre;
    private String descripcion;
    private int costo;
    private int stock;

    public Long getId_Producto() {
        return id_Producto;
    }

    public void setId_Producto(Long id_Producto) {
        this.id_Producto = id_Producto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
