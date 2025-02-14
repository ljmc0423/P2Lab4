/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4;
import java.util.Scanner;
/**
 *
 * @author ljmc2
 */
public abstract class JuegoAhorcadoBase implements JuegoAhorcado {
    
    protected String palabraSecreta;
    protected String palabraActual;
    protected int intentos;
    
    public JuegoAhorcadoBase() {
        this.intentos=5;
    }

    public abstract void actualizarPalabraActual(char letra);
    public abstract boolean verificarLetra(char letra);
    public abstract boolean hasGanado();
    
    @Override
    public void inicializarPalabraSecreta(){
        
    }
    
    @Override
    public void jugar(){
        Scanner lea=new Scanner(System.in).useDelimiter("\n");
        
        while(intentos>0&&!hasGanado()){
            System.out.println("Palabra actual: "+palabraActual);
            System.out.println("Intentos restantes: "+intentos);
            System.out.print("Ingresa una letra: ");
            char letra=lea.next().charAt(0);
            
            if (verificarLetra(letra)) {
                actualizarPalabraActual(letra);
            } else {
                intentos--;
            }
        }
        
        if(hasGanado()){
            System.out.println("Has ganado.");
        }else{
            System.out.println("Has perdido. La palabra secreta era: "+palabraSecreta);
        }
        
        
    }
    
    
    
}
