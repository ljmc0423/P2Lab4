package lab4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FrameFijo extends JFrame implements ActionListener {
    private JButton confirmar, regresar;
    private JTextField letraInput;
    private JLabel palabraLabel;
    private JuegoAhorcadoFijo juego;
    
    public FrameFijo() {
        String palabra = JOptionPane.showInputDialog(null, "Ingrese una palabra");
        juego = new JuegoAhorcadoFijo(palabra);
               
        setTitle("Juego del Ahorcado");
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
        
        letraInput.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                if (letraInput.getText().length() >= 1) {
                    e.consume();
                }
            }
        });
        add(letraInput);
        
        confirmar = new JButton("Confirmar Letra");
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