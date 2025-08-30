/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaloops;

/**
 *
 * @author Geovane
 */
public class JavaLoops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cc = 0;
        while(cc<10){
            cc += 1;
            if(cc==2 || cc==3 || cc==4){ // nessa situção o loop foi quebrado por meio do if
                continue;
            }
            if(cc==7){ //outra mudandança de fluxo, porem o break sai do loop e finaliza a execução, o continue retorna ao inicio
                break;
            }
            System.out.println("CAMBALHOTA" + cc);
            
        }
    }
    
}
