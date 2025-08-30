package com.mycompany.resolucaotela;

import java.awt.Dimension;
import java.awt.Toolkit;

public class Resolucaotela {
    
    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();
        
        int altura = screenSize.height;
        int largura = screenSize.width;
        System.out.println(+ largura + "x" + altura);
    }
}
