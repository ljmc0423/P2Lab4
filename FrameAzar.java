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

public class FrameAzar extends JFrame implements ActionListener{

     private JButton jugarfijo, jugaralazar, regresar;
     private JTextField azar;
    
    public FrameAzar() {
       
        setTitle("Juego");
        setSize(500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        azar=new JTextField();
        azar.setBounds(170, 170, 170, 30);
        add(azar);
        
        regresar = new JButton("Salir");
        regresar.setBounds(170, 200, 170, 30);
        regresar.addActionListener(this);
        add(regresar);
        
        setVisible(true);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==regresar){
           new lab4();
           this.dispose();
       }}
    
}