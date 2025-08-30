/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testetipos;

/**
 *
 * @author Geovane
 */
public class TesteTipos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        int idade = 30;
//        String valor = Integer.toString(idade);
//        /*Aqui é usada uma conversão de tipos
//        ao tentar colocar um valor numerico
//        em uma string o Java da erro, pois 
//        é uma linguagem fortemente tipada
//        então usa-se a conversão da Wrapper Class
//        Integer para a Wrapper Class String por meio
//        do métdo .to[tipo], no caso Integer.toString(valor)*/
//        System.out.println(valor);
        
//        Num caso contrario: 
        
        String valor = "30.5";
        float idade = Float.parseFloat(valor);
//        aqui estou convertendo uma string para o 
//        tipo float, por meio do .parseFloat
        System.out.printf("%.3f", idade);
//         int idade = Integer.parseInt(valor);
////        aqui estou convertendo uma string para o 
////        tipo integer, por meio do .parseInt
//        System.out.print(idade);
    }
    
}
