/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemainventario;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Lourdes
 */
public class SistemaInventario {

    public static void main(String[] args) {
        ArrayList inventario = new ArrayList();

        int opcion = 0;
        while (opcion != 8) {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("\n MENU: \n"
                    + "1. Agregar Comida\n"
                    + "2. Agregar Bebida\n"
                    + "3. Modificar Productos\n"
                    + "4. Eliminar Producto\n"
                    + "5. Mostrar Productos\n"
                    + "6. Generar Compra\n"
                    + "7. Registro Compras\n"
                    + "8. Salir"));

            if (opcion == 1) {

                Comida C = new Comida(JOptionPane.showInputDialog(" Ingrese el Nombre de la Comida: \n"),
                        Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Precio de la Comida: \n")),
                        JOptionPane.showInputDialog("Estado de la Comida: \n" + "\n(Vencido / No Vencido)"));
                inventario.add(C);
            }
            if (opcion == 2) {

                Bebidas B = new Bebidas(JOptionPane.showInputDialog("Ingrese el Nombre de la Bebida: \n"),
                        Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Precio de la Bebida: \n")),
                        Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Tamaño de la Bebida: \n")));
                inventario.add(B);
            }
            if (opcion == 3) {
                for (int i = 0; i < inventario.size(); i++) {
                    JOptionPane.showMessageDialog(null, "" + inventario.indexOf(inventario.get(i)) + "-" + inventario.get(i));
                }
                int posicion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion a modificar: "));
                if (posicion >= 0 && posicion < inventario.size()) {
                    if (inventario.get(posicion) instanceof Comida) {
                        ((Comida) inventario.get(posicion)).setNombreComida(JOptionPane.showInputDialog(" Ingrese el Nombre de la Comida: \n"));
                        ((Comida) inventario.get(posicion)).setPrecioComida(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Precio de la Comida: \n")));
                        ((Comida) inventario.get(posicion)).setEstadoVencimiento(JOptionPane.showInputDialog("Estado de la Comida: \n" + "\n(Vencido / No Vencido)"));
                    }
                    if (inventario.get(posicion) instanceof Bebidas){
                        ((Bebidas) inventario.get(posicion)).setNombreBebidas(JOptionPane.showInputDialog("Ingrese el Nombre de la Bebida: \n"));
                        ((Bebidas) inventario.get(posicion)).setPrecioBebidas( Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Precio de la Bebida: \n")));
                        ((Bebidas) inventario.get(posicion)).setTamaño(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Tamaño de la Bebida: \n")));
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No existe ningun producto en la posicion ingresada!!!");
                }
            }
            if (opcion == 4) {
                for (int i = 0; i < inventario.size(); i++) {
                    JOptionPane.showMessageDialog(null, " " + inventario.indexOf(inventario.get(i)) + "-" + inventario.get(i));
                }
                int pos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion a eliminar"));
                if (pos >= 0 && pos < inventario.size()) {
                    int confirmacion = JOptionPane.showConfirmDialog(null, "Esta seguro de eliminarlo?");
                    if (confirmacion == 0) {
                        inventario.remove(pos);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No existe ningun producto en la posicion ingresada!!!");
                }
            }
            if (opcion == 5) {
                for (int i = 0; i < inventario.size(); i++) {
                    JOptionPane.showMessageDialog(null, " " + inventario.indexOf(inventario.get(i)) + "-" + inventario.get(i));
                }
            }
        }
    }
}
