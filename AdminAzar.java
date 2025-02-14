package lab4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class AdminAzar extends JFrame implements ActionListener {
    private JButton confirmar, regresar;
    private JTextField palabra;
    private JLabel palabraLabel;

    
    public AdminAzar() {
      
        setTitle("Anadir Jugadores");
        setSize(500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        palabra = new JTextField();
        palabra.setBounds(170, 170, 170, 30);
        palabra.setHorizontalAlignment(SwingConstants.CENTER);

        confirmar = new JButton("Agregar Palabra");
        confirmar.setBounds(170, 230, 170, 30);
        confirmar.addActionListener(this);
        add(confirmar);
        
    
        regresar = new JButton("Regresar Menu");
        regresar.setBounds(170, 290, 170, 30);
        regresar.addActionListener(this);
        add(regresar);
        
        setVisible(true);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == regresar) {
            new lab4();
            this.dispose();
        }
    }
}