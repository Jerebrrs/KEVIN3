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
public class EjercisiosEncuento4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
        int n1, n2;
        System.out.println("Por favor ingrese dos numeros:  ");
        n1 = leer.nextInt();
        n2 = leer.nextInt();
         
        if (n1> 25 && n2>25){
            System.out.println(" Ambos numeros son mayores a 25 ");
        } else if (n1>25 || n2> 25){
            System.out.println("Uno de los numeros ingresados es mayor a 25");
        }else{
            System.out.println("Ninguno de los numeros ingresado es mayor a 25");
        }
    }
    
}
