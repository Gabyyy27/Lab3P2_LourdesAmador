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
            }
            if (opcion == 2) {
                
                Bebidas B = new Bebidas(JOptionPane.showInputDialog(" Ingrese el Nombre de la Bebida: \n"),
                        Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Precio de la Bebida: \n")),
                        Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Tamaño de la Bebida: \n")));
        }
      }
    }
}
