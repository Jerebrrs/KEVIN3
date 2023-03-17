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
public class ejercisio4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        float cell ,farr ;
        System.out.print("Ingrese los grados centigrados");
        cell = leer.nextFloat();
        farr = 32 + (9* cell / 5);
        System.out.println("LA temperatura en grados Farengert es de: " + farr +  "°F" );
    }
}
