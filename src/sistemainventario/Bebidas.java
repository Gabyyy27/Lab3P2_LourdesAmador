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
public class Bebidas {
    
    private String NombreBebidas;
    private int PrecioBebidas;
    private int Tamaño;

    public String getNombreBebidas() {
        return NombreBebidas;
    }

    public void setNombreBebidas(String NombreBebidas) {
        this.NombreBebidas = NombreBebidas;
    }

    public int getPrecioBebidas() {
        return PrecioBebidas;
    }

    public void setPrecioBebidas(int PrecioBebidas) {
        this.PrecioBebidas = PrecioBebidas;
    }

    public int getTamaño() {
        return Tamaño;
    }

    public void setTamaño(int Tamaño) {
        this.Tamaño = Tamaño;
    }

    public Bebidas(String NombreBebidas, int PrecioBebidas, int Tamaño) {
        this.NombreBebidas = NombreBebidas;
        this.PrecioBebidas = PrecioBebidas;
        this.Tamaño = Tamaño;
    }

    @Override
    public String toString() {
        return " B E B I D A S: \n" + "\n Nombre= " + NombreBebidas +
                "\n Precio= " +" lps"+ PrecioBebidas + "\n Tamaño= " + Tamaño + " ML";
    }
    
    
    
}
