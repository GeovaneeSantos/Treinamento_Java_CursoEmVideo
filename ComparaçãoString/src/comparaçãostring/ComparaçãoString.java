/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comparaçãostring;

/**
 *
 * @author Geovane
 */
public class ComparaçãoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String n1 = "Gustavo";
        String n2 = "Gustavo";
        String n3 = new String("Gustavo");
        String res;
        res = (n1.equals(n3))?"igual":"diferente";
        System.out.println(res);
    }
    
}
