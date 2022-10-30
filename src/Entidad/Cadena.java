/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author hdsot
 */
public class Cadena {
    private String frase;
    int largo;

    public Cadena() {
    }

    public Cadena(String frase, int largo) {
        this.frase = frase;
        this.largo = largo;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    @Override
    public String toString() {
        return "Cadena{" + "frase=" + frase + ", largo=" + largo + '}';
    }
    
    
}
