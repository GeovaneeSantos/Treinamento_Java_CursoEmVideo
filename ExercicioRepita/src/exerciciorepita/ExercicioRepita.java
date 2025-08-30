/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciorepita;

import javax.swing.JOptionPane; // BIBLIOTECA QUE JÁ POSSUI JANELAS PRONTAS
/**
 *
 * @author Geovane
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int resp = 1, n, s = 0;
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe um valor"));
            s += n;
        } while (resp != 0);
    }
    
}
