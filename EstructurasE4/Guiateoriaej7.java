/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercisiosencuento4;
import java.util.Scanner;


/**
 *
 * @author Usuario
 */
public class Guiateoriaej7 {
    public static void main(String[] args ){
        Scanner leer = new Scanner (System.in);
        int tipomotor;
        System.out.println("INgrese un tipo de motor 1 a 4");
        tipomotor = leer.nextInt();
        switch (tipomotor){
            case 1 : System.out.println("la bomba es una bomba de agua");
            break;
            
            case 2: System.out.println("La bomba es una bomba de gasolina");
            break;
            
            case 3: System.out.println("la bomba es de ormigon");
            break;
            
            case 4: System.out.println("La bomba es una bomba de pasta alimenticia");
            
            default:System.out.println("No existe un valor valido para tipo bomba");
        }   
        
        
    }
    
}
