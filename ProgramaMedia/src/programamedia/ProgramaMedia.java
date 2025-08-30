/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programamedia;

import java.util.Scanner;

/**
 *
 * @author Geovane
 */
public class ProgramaMedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        Double n1, n2;
        System.out.print("Nota 1:");
         n1 = teclado.nextDouble();
        System.out.print("Nota 2:");
         n2 = teclado.nextDouble();
         Double m = (n1 + n2) / 2;
        System.out.println(m);
        if(m >= 9){
            System.out.println("PARABENS");
        }
        else{
            System.out.println("Muito bem, precisa melhorar !");
        }
    }
    
}
