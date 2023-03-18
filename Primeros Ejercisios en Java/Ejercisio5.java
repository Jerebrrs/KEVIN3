/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercisios1;
import java.util.Scanner;
import static java.lang.Math.sqrt;
/**
 *
 * @author Usuario
 */
public class Ejercisio5 {
     public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
         System.out.println("Ingrese un numero entero: ");
         int num = leer.nextInt();
         System.out.println("Escribir el doble de "+ num + " Es: "+ (num*2));
         System.out.println("Escribir el triple de "+ num + " Es: "+ (num*3));
         System.out.println("La raiz cuadrada de "+ num + " Es: "+ (Math.sqrt(num)));
     }
}
