
package lab4;

import java.util.Random;

/**
 *
 * @author ljmc2
 */
public class AdminPalabrasSecretas{
    
    public static String[] palabrasSecretas = new String[50];
    public static int contadorListaAzar=0;
    
    public void añadirPalabra(String palabra) {
        for (int i = 0; i < palabrasSecretas.length; i++) {
            if(palabrasSecretas[i] == null) {
                palabrasSecretas[i] = palabra;
                contadorListaAzar++;
            }
        }
    }
    
    public String palabrasAlAzar() {
        Random alAzar = new Random();
        int min = 0;
        int max= palabrasSecretas.length;
        int randomNumber = alAzar.nextInt(max - min + 1) + min;
        return palabrasSecretas[randomNumber];
    }
}