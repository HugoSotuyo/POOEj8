/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej8;

import Entidad.Cadena;
import Servicio.CadenaServicio;
import java.util.Scanner;

/**
 *
 * @author hdsot
 */
public class POOEj8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String frase,letra;
        int largo;
        Scanner leer = new Scanner(System.in);
        Cadena cadena = new Cadena();
        CadenaServicio caden = new CadenaServicio();
        
        System.out.println("Ingrese una frase ");
        frase=leer.nextLine();
        largo=frase.length();
        
        cadena.setFrase(frase);
        cadena.setLargo(largo);
        
        System.out.println("La frase ingresada tiene "+ caden.mostrarVocales(frase, largo)
        + " vocales ");
        System.out.println("La frase invertida es ");
        System.out.println(caden.invertirFrase(frase, largo));
        System.out.println("Ingrese una letra");
        letra=leer.next();
        System.out.println("La frase tiene la letra " + letra +
                " repetida "+ caden.vecesRepetido(frase, largo, letra)+ " veces ");
        caden.compararLongitud(frase);
        caden.unirFrases(frase);
        caden.reemplazar(frase, largo);
        caden.contiene(frase, largo);
        
    }
    
}
