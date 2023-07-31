/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t4.semana.pkg2.rodiguez.jose;

/**
 *
 * @author david
 */
public class CarneEmbutidos {
   private String procedencia;
   private double cantidad;
   private String tipo;
   private double precio;

    public CarneEmbutidos(String procedencia, double cantidad, String tipo, double precio) {
        this.procedencia = procedencia;
        this.cantidad = cantidad;
        this.tipo = tipo;
        this.precio = precio;
    }

    public String getProcedencia() {
        return procedencia;
    }

    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "\nProcedencia=" + procedencia + ", Cantidad=" + cantidad + ", Tipo=" + tipo + ", Precio=" + precio;
    }
   
   
}
