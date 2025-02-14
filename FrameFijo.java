/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4;

/**
 *
 * @author danilos
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FrameFijo extends JFrame implements ActionListener{

     private JButton jugarfijo, confirmar, regresar;
     private JTextField azar;
     private String palabra;
    
    public FrameFijo(String palabra) {
        this.palabra = palabra;
        JuegoAhorcadoFijo jugar=new JuegoAhorcadoFijo(palabra);
        
        setTitle("Juego");
        setSize(500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        azar=new JTextField();
        azar.setBounds(170, 170, 170, 30);
        add(azar);
        
        regresar = new JButton("Regresar Menu");
        regresar.setBounds(170, 230, 170, 30);
        regresar.addActionListener(this);
        add(regresar);
        
        confirmar = new JButton("Confirmar Palabra");
        confirmar.setBounds(170, 210, 170, 30);
        confirmar.addActionListener(this);
        add(confirmar);
        
        setVisible(true);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==regresar){
           new lab4();
           this.dispose();
       }}
    
}
