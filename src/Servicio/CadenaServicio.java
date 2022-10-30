/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import java.util.Scanner;

/**
 *
 * @author hdsot
 */
public class CadenaServicio {
Scanner leer = new Scanner(System.in);
    public int mostrarVocales(String frase, int largo) {
        int contador = 0;
        for (int i = 0; i < largo; i++) {
            if (frase.substring(i, i + 1).equalsIgnoreCase("a")
                    || frase.substring(i, i + 1).equalsIgnoreCase("e")
                    || frase.substring(i, i + 1).equalsIgnoreCase("i")
                    || frase.substring(i, i + 1).equalsIgnoreCase("o")
                    || frase.substring(i, i + 1).equalsIgnoreCase("u")) {
                contador = contador +1;
            }
        }
        return contador;
    }
    public String invertirFrase(String frase,int largo){
        String fraseInvert="";
        for (int i = 0; i < largo; i++) {
        fraseInvert=fraseInvert.concat(frase.substring((largo-i-1),(largo-i)));
        }
        
        return fraseInvert;
    }
    public int vecesRepetido(String frase,int largo,String letra){
        int contador =0;
        for (int i = 0; i < largo; i++) {
            if(frase.substring(i, i+1).equalsIgnoreCase(letra)){
                contador+=1;
            }
            
        }
     return contador;  
    }
    public void compararLongitud(String frase){
        String nuevaFrase;
        int resultado;
        //Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la nueva frase para comparar el largo");
        nuevaFrase=leer.nextLine();
        resultado=frase.compareTo(nuevaFrase);
        if(resultado==0){
            System.out.println("Las frases tienen el mismo largo");
        } else if (resultado<0){
            System.out.println("La frase original es menor que la nueva");
        }else {
            System.out.println("La frase original es mayor que la nueva");
        }
    }
    public void unirFrases(String frase){
        String fraseNueva,fraseUnida;
        System.out.println("Ingrese una nueva frase para unir con la original");
        fraseNueva=leer.nextLine();
        fraseUnida=frase.concat(" "+fraseNueva);
        System.out.println("La frase unida es: "+ fraseUnida);
    }
    public void reemplazar(String frase,int largo){
        String letrareemplazo,letra;
        String frasenueva="";
        System.out.println("Ingrese una letra para ser el remmplazo de la a");
        letrareemplazo=leer.next();
        for (int i = 0; i < largo; i++) {
            if(frase.substring(i,i+1).equalsIgnoreCase("a")){
                letra=letrareemplazo;
            }else{
                letra=frase.substring(i, i+1);
            }
            frasenueva=frasenueva.concat(letra);
        }
        System.out.println("La frase nueva es "+ frasenueva);
    }
    public void contiene(String frase, int largo) {
        boolean resultado = false;
        String letra, valor;
        System.out.println("Ingrese la letra para verificar si esta en la frase");
        letra = leer.next();
        for (int i = 0; i < largo; i++) {
            if (frase.substring(i, i + 1).equalsIgnoreCase(letra)) {
                resultado = true;
                i = largo;
            }
        }
        if (resultado == true) {
            System.out.println("VERDADER0");
        } else {
            System.out.println("FALSO");
        }
    }
}
