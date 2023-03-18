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
 */
public class ejercisiosbucles1 {
     public static void main (String[] args){
        Scanner leer = new Scanner (System.in);
        
         System.out.println("Ingrese una nota de 0 a 10");
         
        int nota = leer.nextInt();
        
        while (nota<0 || nota >10){ //la nota entre 0 y 10
            
            System.out.println("La nota ingrsada no es correcta");
            nota = leer.nextInt();
        }
         System.out.println("La nota ingresada es correcta");
     }
    
}
