/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package verificaidade;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Geovane
 */
public class VerificaIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        LocalDate hoje = LocalDate.now();
        int ano = hoje.getYear();
        int anc;
        System.out.print("Digite seu ano de nascimento: ");
        anc = teclado.nextInt();
        if ((ano-anc)>=18) {
            System.out.println("APTO PARA CNH");
        }
        else{
            System.out.println("NÃO APTO PARA CNH");
            System.out.println("Faltam " + (18-(ano-anc)) + " anos !");
        }
    }
    
}
