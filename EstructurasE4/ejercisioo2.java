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
public class ejercisioo2 {
    public static void main (String[] args){
        Scanner leer = new Scanner (System.in);
        
        String frase;
        
        System.out.println("Por favor ingrse una frase");
        frase = leer.nextLine();
        
        if (frase.equalsIgnoreCase("eureka")){
            
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
        
        
    
    }
}
