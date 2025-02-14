package lab4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class AdminAzar extends JFrame implements ActionListener {
    private JButton confirmar, regresar;
    private JTextField palabra;
    private JLabel palabraLabel;
    private JTextField letraInput;
    
    
    public AdminAzar() {
      
        setTitle("Añadir Palabras");
        setSize(500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        palabra = new JTextField();
        palabra.setBounds(170, 170, 170, 30);
        palabra.setHorizontalAlignment(SwingConstants.CENTER);
        
        letraInput = new JTextField();
        letraInput.setBounds(170, 170, 170, 30);
        letraInput.setHorizontalAlignment(SwingConstants.CENTER);
        
        
        add(letraInput);

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
            new MenuAzar();
            this.dispose();
        } else if(e.getSource()==confirmar){
            String input = letraInput.getText().trim();
            for(int i=0;i<AdminPalabrasSecretas.palabrasSecretas.length;i++){
                if(AdminPalabrasSecretas.palabrasSecretas!=null){
                    AdminPalabrasSecretas.palabrasSecretas[i]=input;
                    JOptionPane.showMessageDialog(null, "Palabra añadida", "Exito", JOptionPane.INFORMATION_MESSAGE);
                    new MenuAzar();
                    this.dispose();
                    break;
                }
            }
        }
    }
}