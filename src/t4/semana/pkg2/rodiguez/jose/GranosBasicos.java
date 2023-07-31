/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t4.semana.pkg2.rodiguez.jose;

import javax.swing.JOptionPane;

/**
 *
 * @author david
 */
public class GranosBasicos {

    private String nombre;
    private double quintal;
    private double precio;
    private String UnidMedida;
    private String Procedencia;

    public GranosBasicos(String nombre, double quintal, double precio, String UnidMedida, String Procedencia) {
        this.nombre = nombre;
        this.quintal = quintal;
        this.precio = precio;
        this.UnidMedida = UnidMedida;
        this.Procedencia = Procedencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getQuintal() {
        return quintal;
    }

    public void setQuintal(double quintal) {
        this.quintal = quintal;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getUnidMedida() {
        return UnidMedida;
    }

    public void setUnidMedida(String UnidMedida) {
        this.UnidMedida = UnidMedida;
    }

    public String getProcedencia() {
        return Procedencia;
    }

    public void setProcedencia(String Procedencia) {
        this.Procedencia = Procedencia;
    }

    @Override
    public String toString() {
        return  "\nNombre=" + nombre + ", Quintal=" + quintal + ", Precio=" + precio + ", UnidadMedida=" + UnidMedida + ", Procedencia=" + Procedencia + '}';
    }
    
    
    
    
}
