/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//isso acima é um comentário de múltiplas linhas /* */
package tiposprimitivos;
import java.util.Scanner; // aqui importei a lib para entrada de dados


/**
 *
 * @author Geovane
 */
//isso acima é um comentário de múltiplas linhas para documentação/** */

public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //isso é um comentário de linha '//'
       Scanner teclado = new Scanner(System.in);
       /* Para usar um scanner é preciso criar um 
       objeto da classe Scanner que terá seu valor 
       por meio da entrada padrão do 
       sistema, o computador usa o teclado
       como entrada padrão*/
        System.out.print("Digite o nome do Aluno:");
       String nome = teclado.nextLine();
       /*Para atribuir o dado de entrada a uma 
       variavel é precisor usar 
       o metodo .next[tipode dado]*/
        System.out.print("Digite a nota do Aluno:");
       float nota = teclado.nextFloat();
       System.out.printf("A nota de %s = %.2f \n", nome, nota);
    }
    
}
