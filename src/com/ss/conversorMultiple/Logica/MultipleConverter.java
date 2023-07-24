package com.ss.conversorMultiple.Logica;

import com.ss.conversorMultiple.GUI.ConverterMenu;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;


public class MultipleConverter {

    
    public static void main(String[] args) {
        
        ConverterMenu menu = new ConverterMenu();
        
        menu.setVisible(true);
        menu.setLocationRelativeTo(null);
        menu.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
}
