/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package verificarvoto;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author Geovane
 */
public class VerificarVoto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        LocalDate hoje = LocalDate.now();
        int ano = hoje.getYear();
        System.out.print("Ano de nascimento: ");
        int nasc = teclado.nextInt();
        int id = ano - nasc;
        if (id<16){
            System.out.println("Não Vota !\n Fatam " + (16 - id) + " anos para o seu titulo.");
        }else{
        if ((id>=16 && id<18) || (id>70)){
            System.out.println("Voto Opcional");
        }else{
            System.out.println("Voto Obrigatorio !");
        }
      } 
    }
    
}
