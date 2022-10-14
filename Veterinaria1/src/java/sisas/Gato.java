/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sisas;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Gato extends Mascota {      

    @Override
    public String toString() {
        return super.toString() + "toxoplasmosis=" + toxoplas + '}';
    }

    

    public void setToxoplas(String toxoplas) {
        this.toxoplas = toxoplas;
    }

    public String getToxoplas() {
        return toxoplas;
    }

    public Gato() {
    }

    public Gato(String nombre, String raza, String color, int edad,String toxoplas) {
        super(nombre, raza, color, edad);
        this.toxoplas = toxoplas;
    }
     

    private String toxoplas; 
}
