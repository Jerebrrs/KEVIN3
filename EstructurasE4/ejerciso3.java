/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercisios1;
import java.util.Scanner;
/**
 *
 * @author Usuario
 *///realizar un programa que solo puede escribir 8 palabras
public class ejerciso3 {
    public static void main (String[] args){
        Scanner leer = new Scanner (System.in);
        
        String frase;
        
        
        System.out.println("Por favor ingrese una palabra de 8 cARACTERES");
        frase = leer.nextLine();
        
        int largo = frase.length();
        
        if (largo==8){
            System.out.println("Correcto ");
        }else{
            System.out.println("Incorrecto ");
        }
    }
}
