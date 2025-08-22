package mainornitorrinco;

import java.util.Random;
import java.util.Scanner;

/**
*
* @autor 
* Benegas Gonzalez Cristian Rene
* Claudio Mariano Mathot
* AYELEN GUADALUPE AGÜERO
* Rodrigo Bordon
* Santiago González
* Milagros Gilda Alfaro
* José María Urbani
* Julian Martin Esquiaga
*/

public class Castor {
    protected double cola;
    protected double velocidad;
    protected Random random = new Random();
    Scanner leer = new Scanner(System.in);
    
    public Castor(double cola, double velocidad){
        this.cola = cola;
        this.velocidad = velocidad;
    }
    public void nadar(){
        System.out.println("Velocidad de nado: " + velocidad + " km/hora");
    }

    public void tocarGuitarra(){
        for(int x = 0; x < 3; x++){
            int nroRandom = random.nextInt(6) + 1;
            System.out.println("Toca cuerda " + nroRandom);
        }
    }    
}
