/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t4.semana.pkg2.rodiguez.jose;

/**
 *
 * @author david
 */
public class ProductosLimpieza {
    private String tipo;
    private String marca;
    private String codigo;
    private double precio;
    private double cantidad;
    private String proveedor;
    private String nombre;

    public ProductosLimpieza(String tipo, String marca, String codigo, double precio, double cantidad, String proveedor, String nombre) {
        this.tipo = tipo;
        this.marca = marca;
        this.codigo = codigo;
        this.precio = precio;
        this.cantidad = cantidad;
        this.proveedor = proveedor;
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "\nTipo=" + tipo + ", Marca=" + marca + ", Codigo=" + codigo + ", Precio=" + precio + ", Cantidad=" + cantidad + ", Proveedor=" + proveedor + ", Nombre=" + nombre ;
    }
    
    
}
