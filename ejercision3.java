/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercisios1;
import java.util.Scanner;

/**
 *toLowerCase()
 * @author Usuario
 */
public class ejercision3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase:");
        String frase = leer.nextLine();
        System.out.println("La frase en mayuscula es: "+ frase.toUpperCase());
        System.out.println("La frase en minuscula es; "+ frase.toLowerCase());
}
}