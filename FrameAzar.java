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

     private JButton jugarfijo, confirmar, jugaralazar, regresar;
     private JTextField azar,letraInput;
     private JuegoAhorcadoAzar juego;
     private JLabel palabraLabel;
    
    public FrameAzar() {
        juego = new JuegoAhorcadoAzar();
        setTitle("Juego");
        setSize(500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        
        palabraLabel = new JLabel("");
        palabraLabel.setText(juego.getPalabraActual()); 
        palabraLabel.setBounds(170, 120, 170, 30);
        palabraLabel.setHorizontalAlignment(SwingConstants.CENTER);
        palabraLabel.setFont(new Font("Arial", Font.BOLD, 20));
        add(palabraLabel);
        
        letraInput = new JTextField();
        letraInput.setBounds(170, 170, 170, 30);
        letraInput.setHorizontalAlignment(SwingConstants.CENTER);
        
        
        add(letraInput);

        azar=new JTextField();
        azar.setBounds(170, 170, 170, 30);
        add(azar);
        
        confirmar = new JButton("Confirmar Letra");
        confirmar.setBounds(170, 230, 170, 30);
        confirmar.addActionListener(this);
        add(confirmar);
        
        regresar = new JButton("Salir");
        regresar.setBounds(170, 200, 170, 30);
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
        else if (e.getSource() == confirmar) {
            String input = letraInput.getText().trim();
            if (!input.isEmpty()) {
                char letra = input.toLowerCase().charAt(0);
                if (juego.verificarLetra(letra)) {
                    juego.actualizarPalabraActual(letra);
                    palabraLabel.setText(juego.getPalabraActual());
                    
                    if (juego.hasGanado()) {
                        JOptionPane.showMessageDialog(this, "¡Felicitaciones! Has ganado!");
                        new lab4();
                        this.dispose();
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Letra incorrecta. ¡Intenta de nuevo!");
                }
            }
            letraInput.setText("");
            letraInput.requestFocus();
        }
    }
    
}