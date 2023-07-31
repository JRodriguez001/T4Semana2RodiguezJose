/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t4.semana.pkg2.rodiguez.jose;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author david
 */
public class T4Semana2RodiguezJose {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        Inventario inventario = new Inventario();

        int opcion = 1;
        while (opcion != 0) {
            int sele = Integer.parseInt(JOptionPane.showInputDialog("Menu\n"
                    + "1. Agregar Producto\n"
                    + "2. Modificar Producto\n"
                    + "3. Eliminar Producto\n"
                    + "4. Simulacion de Facturacion\n"
                    + "5. Reporte\n"));

            if (sele == 1) {
                int cor = Integer.parseInt(JOptionPane.showInputDialog("Seleccione la clase\n"
                        + "1. Granos Basicos\n"
                        + "2. Producto de limpieza\n"
                        + "3. Liquido\n"
                        + "4. Carne y embutidos\n"
                        + "5. Frutas/Verduras\n"));
                if (cor == 1) {
                    String nombre = JOptionPane.showInputDialog("Ingrese el nombre: ");
                    double cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad: "));
                    double precio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio: "));
                    String medidad = JOptionPane.showInputDialog("Ingrese la medida: ");
                    String procedencia = JOptionPane.showInputDialog("Ingrese el lugar de procedencia: ");

                    GranosBasicos nuevoGranos = new GranosBasicos(nombre, cantidad, precio, medidad, procedencia);
                    inventario.AgregarGrano(nuevoGranos);

                } else if (cor == 2) {

                    String tipo = JOptionPane.showInputDialog("Ingrese el tipo(Liquido o polvo): ");
                    String marca = JOptionPane.showInputDialog("Ingrese la marca: ");
                    String codigo = JOptionPane.showInputDialog("Ingrese el codigo(Alfanumerico): ");
                    double precio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio: "));
                    double cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad: "));
                    String proveedor = JOptionPane.showInputDialog("Ingrese el proveedor: ");
                    String nombre = JOptionPane.showInputDialog("Ingrese el nombre: ");

                    ProductosLimpieza nuevoLimpieza = new ProductosLimpieza(tipo, marca, codigo, precio, cantidad, proveedor, nombre);
                    inventario.AgregarLimpieza(nuevoLimpieza, codigo);

                } else if (cor == 3) {
                    DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
                    String categoria = JOptionPane.showInputDialog("Ingrese la categoria(lácteos, gaseosas, jugos, agua: ");
                    String empaque = JOptionPane.showInputDialog("Ingrese el empaque(botella/bote, caja, lata): ");
                    String tamaño = JOptionPane.showInputDialog("Ingrese el tamaño(pequeño, mediano, grande): ");
                    String nombre = JOptionPane.showInputDialog("Ingrese el nombre: ");
                    double precio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio: "));
                    Date fechaVen = df.parse(JOptionPane.showInputDialog("Ingrese la fecha de vencimiento (MM/DD/YYYY): "));

                    Liquidos nuevoLiquido = new Liquidos(categoria, empaque, tamaño, nombre, precio, fechaVen);
                    inventario.AgregarLiquido(nuevoLiquido);

                } else if (cor == 4) {
                    String procedencia = JOptionPane.showInputDialog("Ingrese el lugar de procedencia: ");
                    double cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad: "));
                    String tipo = JOptionPane.showInputDialog("Ingrese el tipo(res, carne blanca, cerdo):");
                    double precio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio: "));

                    CarneEmbutidos nuevoCarnes = new CarneEmbutidos(procedencia, cantidad, tipo, precio);
                    inventario.AgregarCarne(nuevoCarnes);
                } else if (cor == 5) {
                    String categoria;
                    String nombre = JOptionPane.showInputDialog("Ingrese el nombre: ");
                    String tipo = JOptionPane.showInputDialog("Ingrese el tipo(fruta o verdura): ");
                    if (tipo.equalsIgnoreCase("fruta")) {
                        categoria = JOptionPane.showInputDialog("Ingrese la categoria(cítricos, tropical, de grano o rica en fibra): ");
                    } else {
                        categoria = JOptionPane.showInputDialog("Ingrese la categoria(tubérculos, legumbres, de hojas): ");
                    }
                    double precio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio: "));
                    double cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad: "));

                    FrutasVerduras nuevoFruta = new FrutasVerduras(nombre, tipo, precio, cantidad, categoria);
                    inventario.AgregarFrutas(nuevoFruta);
                }
            } else if (sele == 2) {
                int cor = Integer.parseInt(JOptionPane.showInputDialog("Seleccione la clase a modificar\n"
                        + "1. Granos Basicos\n"
                        + "2. Producto de limpieza\n"
                        + "3. Liquido\n"
                        + "4. Carne y embutidos\n"
                        + "5. Frutas/Verduras\n"));
                if (cor == 1) {
                    String nombre = JOptionPane.showInputDialog("Ingrese el nombre a modificar: ");
                    double cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad: "));
                    double precio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio: "));
                    String medidad = JOptionPane.showInputDialog("Ingrese la medida: ");
                    String procedencia = JOptionPane.showInputDialog("Ingrese el lugar de procedencia: ");

                    inventario.modificarGranoBasico(nombre, cantidad, precio, medidad, procedencia);
                    JOptionPane.showMessageDialog(null, "Producto modificado exitosamente");

                } else if (cor == 2) {
                    String codigo = JOptionPane.showInputDialog("Ingrese el codigo a modificar: ");
                    String tipo = JOptionPane.showInputDialog("Ingrese el tipo(Liquido o polvo): ");
                    String marca = JOptionPane.showInputDialog("Ingrese la marca: ");
                    double precio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio: "));

                    String proveedor = JOptionPane.showInputDialog("Ingrese el proveedor: ");
                    double cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad: "));
                    String nombre = JOptionPane.showInputDialog("Ingrese el nombre: ");

                    inventario.modificarLimpieza(tipo, marca, codigo, precio, cantidad, proveedor, nombre);
                    JOptionPane.showMessageDialog(null, "Producto modificado exitosamente");

                } else if (cor == 3) {
                    DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
                    String nombre = JOptionPane.showInputDialog("Ingrese el nombre a modificar: ");
                    String categoria = JOptionPane.showInputDialog("Ingrese la categoriaácteos, gaseosas, jugos, agua: ");
                    String empaque = JOptionPane.showInputDialog("Ingrese el empaque(botella/bote, caja, lata): ");
                    String tamaño = JOptionPane.showInputDialog("Ingrese el tamañopequeño, mediano, grande): ");

                    double precio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio: "));
                    Date fechaVen = df.parse(JOptionPane.showInputDialog("Ingrese la fecha(MM/DD/YYYY): "));

                    inventario.modificarLiquido(categoria, empaque, tamaño, nombre, precio, fechaVen);
                    JOptionPane.showMessageDialog(null, "Producto modificado exitosamente");

                } else if (cor == 4) {
                    String proce = JOptionPane.showInputDialog("Ingrese la procedencia a modificar: ");

                    double cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad: "));
                    String tipo = JOptionPane.showInputDialog("Ingrese el tipo(res, carne blanca, cerdo):");
                    double precio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio: "));
                    inventario.modificarCarne(proce, cantidad, tipo, precio);

                    JOptionPane.showMessageDialog(null, "Producto modificado exitosamente");

                } else if (cor == 5) {
                    String nombre = JOptionPane.showInputDialog("Ingrese el nombre a modificar: ");
                    String categoria;

                    String tipo = JOptionPane.showInputDialog("Ingrese el tipo(fruta o verdura): ");
                    if (tipo.equalsIgnoreCase("fruta")) {
                        categoria = JOptionPane.showInputDialog("Ingrese la categoria(cítricos, tropical, de grano o rica en fibra): ");
                    } else {
                        categoria = JOptionPane.showInputDialog("Ingrese la categoria(tubérculos, legumbres, de hojas): ");
                    }
                    double precio = Integer.parseInt("Ingrese el precio: ");
                    double cantidad = Integer.parseInt("Ingrese la cantidad");

                    JOptionPane.showMessageDialog(null, "Producto modificado exitosamente");
                }

            } else if (sele == 3) {
                int cor = Integer.parseInt(JOptionPane.showInputDialog("Seleccione la clase a modificar\n"
                        + "1. Granos Basicos\n"
                        + "2. Producto de limpieza\n"
                        + "3. Liquido\n"
                        + "4. Carne y embutidos\n"
                        + "5. Frutas/Verduras\n"));
                if (cor == 1) {
                    String nombre = JOptionPane.showInputDialog("Ingrese el nombre a eliminar: ");
                    inventario.eliminarGrano(nombre);
                    JOptionPane.showMessageDialog(null, "Producto eliminado con exito");

                } else if (cor == 2) {
                    String codigo = JOptionPane.showInputDialog("Ingrese el codigo a eliminar: ");
                    inventario.eliminarLimpieza(codigo);
                    JOptionPane.showMessageDialog(null, "Producto eliminado con exito");
                } else if (cor == 3) {
                    String nombre = JOptionPane.showInputDialog("Ingrese el nombre a eliminar: ");

                    inventario.eliminarLiquido(nombre);
                    JOptionPane.showMessageDialog(null, "Producto eliminado con exito");

                } else if (cor == 4) {
                    String proce = JOptionPane.showInputDialog("Ingrese el lugar de procedencia: ");
                    inventario.eliminarCarne(proce);
                    JOptionPane.showMessageDialog(null, "Producto eliminado con exito");
                } else if (cor == 5) {
                    String nombre = JOptionPane.showInputDialog("Ingrese el nombre a eliminar: ");
                    inventario.eliminarFruta(nombre);
                    JOptionPane.showMessageDialog(null, "Producto eliminado con exito");

                }

            } else if (sele == 4) {

                JOptionPane.showMessageDialog(null, "Bienvenido a Maxidespensa");

                ArrayList<Inventario> cesta = new ArrayList<>();

                String nombre = JOptionPane.showInputDialog("Ingrese el nombre a modificar: ");

                GranosBasicos produSele = null;
                String name = JOptionPane.showInputDialog("Ingrese el nombre del grano: ");

                if (produSele == null) {
                    JOptionPane.showMessageDialog(null, "Producto no existe");
                    continue;
                }
                double cant = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad: "));
                if (cant <= 0 || cant > produSele.getQuintal()) {
                    JOptionPane.showMessageDialog(null, "Cantidad no esta en el rango");
                    continue;
                }
                produSele.setQuintal(produSele.getQuintal() - cant);

                double total = 0.0;
                double impuesto = 0.0;

            }

        }

    }
}
