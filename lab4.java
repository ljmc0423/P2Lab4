package lab4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class lab4 extends JFrame implements ActionListener {
    
    private JButton jugarfijo, jugaralazar, salir;
    
    public lab4() {
       
        
        setTitle("Juego");
        setSize(500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        
        jugarfijo = new JButton("Jugar Ahoracado Fijo");
        jugarfijo.setBounds(170, 160, 170, 30);
        jugarfijo.addActionListener(this);
        add(jugarfijo);
        
        jugaralazar = new JButton("Jugar Ahorcado al azar");
        jugaralazar.setBounds(170, 200, 170, 30);
        jugaralazar.addActionListener(this);
        add(jugaralazar);
        
        salir = new JButton("Salir");
        salir.setBounds(170, 240, 170, 30);
        salir.addActionListener(this);
        add(salir);
        
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jugarfijo) {
         this.dispose();
          new FrameFijo();    
        } else if (e.getSource() == jugaralazar) {
           new AdminAzar();
           this.dispose();
        } else if (e.getSource() == salir) {
            System.exit(0);
        }
    }
    
    public static void main(String[] args) {
        new lab4();
    }
}
