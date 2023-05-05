/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemainventario;

/**
 *
 * @author Lourdes
 */
public class Comida {
    private String NombreComida;
    private int PrecioComida;
    private String EstadoVencimiento;

    public String getNombreComida() {
        return NombreComida;
    }

    public void setNombreComida(String NombreComida) {
        this.NombreComida = NombreComida;
    }

    public int getPrecioComida() {
        return PrecioComida;
    }

    public void setPrecioComida(int PrecioComida) {
        this.PrecioComida = PrecioComida;
    }

    public String getEstadoVencimiento() {
        return EstadoVencimiento;
    }

    public void setEstadoVencimiento(String EstadoVencimiento) {
        this.EstadoVencimiento = EstadoVencimiento;
    }

    public Comida(String NombreComida, int PrecioComida, String EstadoVencimiento) {
        this.NombreComida = NombreComida;
        this.PrecioComida = PrecioComida;
        this.EstadoVencimiento = EstadoVencimiento;
    }

    @Override
    public String toString() {
        return " C O M I D A S: \n" + "\n Nombre= " + NombreComida +
                "\n Precio= " + PrecioComida +" lps"+ "\n Estado de Vencimiento= " + EstadoVencimiento;
    }
    
    
    
}
