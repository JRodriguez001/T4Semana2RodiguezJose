/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t4.semana.pkg2.rodiguez.jose;

import java.util.Date;

/**
 *
 * @author david
 */
public class Liquidos {
    private String categoria;
    private String Empaque;
    private String tamaño;
    private String nombre;
    private double precio;
    private Date FechaVence;

    public Liquidos(String categoria, String Empaque, String tamaño, String nombre, double precio, Date FechaVence) {
        this.categoria = categoria;
        this.Empaque = Empaque;
        this.tamaño = tamaño;
        this.nombre = nombre;
        this.precio = precio;
        this.FechaVence = FechaVence;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getEmpaque() {
        return Empaque;
    }

    public void setEmpaque(String Empaque) {
        this.Empaque = Empaque;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Date getFechaVence() {
        return FechaVence;
    }

    public void setFechaVence(Date FechaVence) {
        this.FechaVence = FechaVence;
    }

    @Override
    public String toString() {
        return  "\nCategoria=" + categoria + ", Empaque=" + Empaque + ", Tamaño=" + tamaño + ", Nombre=" + nombre + ", Precio=" + precio + ", FechaVencimiento=" + FechaVence ;
    }
    
    
}
