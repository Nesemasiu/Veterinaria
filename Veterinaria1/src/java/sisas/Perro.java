package sisas;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Perro extends Mascota{

    @Override
    public String toString() {
        return super.toString()+"Nivel de entrenamiento:"+nivelEtreno+'}'; //To change body of generated methods, choose Tools | Templates.
    }

    public void setNivelEtreno(int nivelEtreno) {
        this.nivelEtreno = nivelEtreno;
    }

    public int getNivelEtreno() {
        return nivelEtreno;
    }

    public Perro(int nivelEtreno) {
        this.nivelEtreno = nivelEtreno;
    }

    public Perro(String nombre, String raza, String color, int edad,int nivelEtreno) {
        super(nombre, raza, color, edad);
        this.nivelEtreno = nivelEtreno;
    }

    public Perro() {
    }
    private int nivelEtreno; 
    
}
