package com.mycompany.linguagemdosistema;

import java.util.Locale;

public class Linguagemdosistema {
    public static void main(String[] args) {
        Locale currentLocale = Locale.getDefault();
        System.out.println("Idioma do Sistema: " + currentLocale.getDisplayName());
    }
}
