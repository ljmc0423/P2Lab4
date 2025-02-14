/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4;

/**
 *
 * @author ljmc2
 */
import java.util.Random;

public class JuegoAhorcadoAzar extends JuegoAhorcadoBase{

    public JuegoAhorcadoAzar() {
        Random azar=new Random();
        this.palabraSecreta=AdminPalabrasSecretas.palabrasSecretas[0];
        this.palabraActual="_".repeat(palabraSecreta.length());
    }

    @Override
    public void actualizarPalabraActual(char letra){
        StringBuilder sb = new StringBuilder(palabraActual);
        for(int i=0;i<palabraSecreta.length(); i++){
            if(palabraSecreta.charAt(i)==letra){
                sb.setCharAt(i,letra);
            }
        }
        palabraActual=sb.toString();
    }

    @Override
    public boolean verificarLetra(char letra){
        return palabraSecreta.indexOf(letra)>=0;
    }

    @Override
    public boolean hasGanado(){
        return palabraActual.equals(palabraSecreta);
    }
}