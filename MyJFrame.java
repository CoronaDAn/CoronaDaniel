/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.my.company.jframe;

/**
 *
 * @author daniela
 */
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyJFrame extends JFrame {
    private JLabel myLabel;

    public MyJFrame() {
        // Configuración de la ventana
        setTitle("Mi Ventana");
        setSize(250, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Configuración de la etiqueta
        myLabel = new JLabel("   Hola Mundo");
        add(myLabel);
        
        // Mostrar la ventana
        setVisible(true);
    }

    public static void main(String[] args) {
        new MyJFrame();
    }
}
