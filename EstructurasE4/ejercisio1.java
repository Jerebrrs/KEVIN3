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
public class ejercisio1 {
    public static void main (String[] args){
        Scanner leer = new Scanner (System.in);
        int n;
        
        System.out.println("Ingrese un numero ");
        n = leer.nextInt();
        
        if (n%2 == 0){
            System.out.println("El numero ingresado es par ");
        } else{
            System.out.println("El numero ingresado no es par");
        }
    }
    
}
