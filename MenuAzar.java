package lab4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class MenuAzar extends JFrame implements ActionListener {
    
    private JButton jugaralazar, anadirazar, regresar;
    
    public MenuAzar() {
       
        setTitle("Menu del Juego de al azar ");
        setSize(500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        
        jugaralazar = new JButton("Jugar Ahoracado al azar");
        jugaralazar.setBounds(170, 160, 170, 30);
        jugaralazar.addActionListener(this);
        add(jugaralazar);
        
        anadirazar = new JButton("Anadir Ahorcado al azar");
        anadirazar.setBounds(170, 200, 170, 30);
        anadirazar.addActionListener(this);
        add(anadirazar);
        
        regresar = new JButton("Regresar");
        regresar.setBounds(170, 240, 170, 30);
        regresar.addActionListener(this);
        add(regresar);
        
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jugaralazar) {
            if(AdminPalabrasSecretas.palabrasSecretas[0]==null){
                JOptionPane.showMessageDialog(null, "Lista de palabras vacía, favor añada", "Error", JOptionPane.INFORMATION_MESSAGE);
                new MenuAzar();
                this.dispose();
            }else{
                
         this.dispose();
          new FrameAzar();    
            }
        } else if (e.getSource() == anadirazar) {
           new  AdminAzar();
           this.dispose();
        } else if (e.getSource() == regresar) {
            new lab4();
            this.dispose();
        }
    }
    
    public static void main(String[] args) {
        new lab4();
    }
}
