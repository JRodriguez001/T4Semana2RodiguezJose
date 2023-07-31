/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t4.semana.pkg2.rodiguez.jose;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author david
 */
public class Inventario {

    private ArrayList<GranosBasicos> granos;
    private ArrayList<ProductosLimpieza> Limpieza;
    private ArrayList<Liquidos> liquidos;
    private ArrayList<CarneEmbutidos> carneEm;
    private ArrayList<FrutasVerduras> frutas;

    public Inventario() {
        granos = new ArrayList<>();
        Limpieza = new ArrayList<>();
        liquidos = new ArrayList<>();
        carneEm = new ArrayList<>();
        frutas = new ArrayList<>();

    }
    
    
    public void FacLimpiez(ProductosLimpieza limp, String nombre){
        
    }
    public void FacLiquidos(Liquidos liqui,String nombre){
        
    }

    public void AgregarGrano(GranosBasicos grano) {
        granos.add(grano);
    }

    public void modificarGranoBasico(String nombre, double cantidadQuintales, double precio, String unidadMedida, String lugarProcedencia) {
        for (GranosBasicos grano : granos) {
            if (grano.getNombre().equalsIgnoreCase(nombre)) {
                grano.setQuintal(cantidadQuintales);
                grano.setPrecio(precio);
                grano.setUnidMedida(unidadMedida);
                grano.setProcedencia(lugarProcedencia);
                JOptionPane.showMessageDialog(null, "Se ha modificado");
                return;
            }
        }
    }

    public void eliminarGrano(String nombre) {
        for (GranosBasicos grano : granos) {
            if (grano.getNombre().equalsIgnoreCase(nombre)) {
                granos.remove(grano);
            }
        }
    }
    public void FacturacionGranos(GranosBasicos gran,String nombre){
        for (GranosBasicos grano : granos) {
            if (grano.getNombre().equalsIgnoreCase(nombre)) {
                
                return;
            }
        }
    }

    public void AgregarLimpieza(ProductosLimpieza limpieza, String codigo) {
        if (!limpieza.getCodigo().contains(codigo)) {
            Limpieza.add(limpieza);
        } else {
            JOptionPane.showMessageDialog(null, "Codigo ya existente");
        }

    }

    public void modificarLimpieza(String tipo, String marca, String codigo, double precio, double cantidad, String proveedor, String nombre) {
        for (ProductosLimpieza limpieza : Limpieza) {
            if (limpieza.getCodigo().equalsIgnoreCase(codigo)) {
                limpieza.setTipo(tipo);
                limpieza.setMarca(marca);
                limpieza.setCodigo(codigo);
                limpieza.setPrecio(precio);
                limpieza.setCantidad(cantidad);
                limpieza.setProveedor(proveedor);
                limpieza.setNombre(nombre);
                JOptionPane.showMessageDialog(null, "Se ha modificado");
                return;
            }
        }
    }

    public void eliminarLimpieza(String codigo) {
        for (ProductosLimpieza limpieza : Limpieza) {
            if (limpieza.getCodigo().equalsIgnoreCase(codigo)) {
                Limpieza.remove(limpieza);
            }
        }
    }

    public void AgregarLiquido(Liquidos liquido) {
        liquidos.add(liquido);
    }

    public void modificarLiquido(String categoria, String Empaque, String tamaño, String nombre, double precio, Date FechaVence) {
        for (Liquidos liquido : liquidos) {
            if (liquido.getNombre().equalsIgnoreCase(nombre)) {
                liquido.setCategoria(categoria);
                liquido.setEmpaque(Empaque);
                liquido.setTamaño(tamaño);
                liquido.setNombre(nombre);
                liquido.setPrecio(precio);
                liquido.setFechaVence(FechaVence);
                JOptionPane.showMessageDialog(null, "Se ha modificado");
                return;
            }
        }
    }

    public void eliminarLiquido(String nombre) {
        for (Liquidos liquido : liquidos) {
            if (liquido.getNombre().equalsIgnoreCase(nombre)) {
                liquidos.remove(liquido);
            }
        }
    }

    public void AgregarCarne(CarneEmbutidos carne) {
        carneEm.add(carne);
    }

    public void modificarCarne(String procedencia, double cantidad, String tipo, double precio) {
        for (CarneEmbutidos carne : carneEm) {
            if (carne.getProcedencia().equalsIgnoreCase(procedencia)) {
                carne.setProcedencia(procedencia);
                carne.setCantidad(cantidad);
                carne.setTipo(tipo);
                carne.setPrecio(precio);
                JOptionPane.showMessageDialog(null, "Se ha modificado");
                return;
            }
        }
    }

    public void eliminarCarne(String procedencia) {
        for (CarneEmbutidos carne : carneEm) {
            if (carne.getProcedencia().equalsIgnoreCase(procedencia)) {
                carneEm.remove(carne);
            }
        }
    }

    public void AgregarFrutas(FrutasVerduras fruta) {
        frutas.add(fruta);
    }

    public void modificarFrutas(String nombre, String tipo, double precio, double cantidad, String categoria) {
        for (FrutasVerduras fruta : frutas) {
            if (fruta.getNombre().equalsIgnoreCase(nombre)) {
                fruta.setNombre(nombre);
                fruta.setTipo(tipo);
                fruta.setPrecio(precio);
                fruta.setCantidad(cantidad);
                fruta.setCategoria(categoria);
                JOptionPane.showMessageDialog(null, "Se ha modificado");
                return;
            }
        }
    }

    public void eliminarFruta(String nombre) {
        for (FrutasVerduras fruta : frutas) {
            if (fruta.getNombre().equalsIgnoreCase(nombre)) {
                frutas.remove(fruta);
            }
        }
    }

    @Override
    public String toString() {
        return "Inventario:" + "\nGranos=" + granos + "\nProductos de Limpieza=" + Limpieza + "\nLiquidos=" + liquidos + "\nCarnes y embutidos=" + carneEm + "\nFrutas/verduras=" + frutas;
    }

}
