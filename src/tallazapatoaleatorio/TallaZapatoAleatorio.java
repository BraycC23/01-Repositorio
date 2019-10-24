/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallazapatoaleatorio;

import java.util.Random;

/**
 *
 * @author Lucas Nahuel Muga - lucasnahuelmuga@gmail.com
 */
public class TallaZapatoAleatorio {
public static final Random RND = new Random();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Constantes
        
        final int TALLA_MIN = 20;
        final int TALLA_MAX = 60;
        
        // Variable
        
        int talla;
        
        // Generar dato
        
        talla = RND.nextInt(TALLA_MAX - TALLA_MIN + 1) + TALLA_MIN;
        
        // Mensaje
        
        System.out.printf("Talla de zapato ....: %d%n", talla);
        
    }
    
}
