
package com.adr.main;

import com.adr.ui.JButtonMainUI;


public class JButtonMain {
    
        public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JButtonMainUI mainFrame = new JButtonMainUI();
                mainFrame.setVisible(true);
                mainFrame.setLocationRelativeTo(null); // Centrar la ventana
                //mainFrame.setImage(); // Llamar al método para mostrar la imagen
            }
        });
    }
    
}
