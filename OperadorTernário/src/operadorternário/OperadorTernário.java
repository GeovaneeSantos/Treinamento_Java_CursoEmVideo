/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadorternário;

/**
 *
 * @author Geovane
 */
public class OperadorTernário {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1, n2, r;
        n1 = 14;
        n2 = 10;
        r = (n1>n2)?n1+n2:n1-n2;//r = 0 ou 1, depedendo da expressao n1>n2
        //0 se for true, 1 se for false
        System.out.println(r);
    }
    
}
