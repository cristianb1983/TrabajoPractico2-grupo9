package mainornitorrinco;

import java.util.InputMismatchException;
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
    protected String nombre;
    protected Random random = new Random();
    
    public Castor(String nombre){
        this.nombre = nombre;
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
    
    public void cargarDatos(Scanner leer){
        do{
            try{
                System.out.println("Ingrese la longitud de la cola (entre 0-6.8 cm)");
                this.cola = leer.nextDouble();
                if (this.cola > 6.8 || this.cola < 0){
                    System.out.println("No puede ser mayor a 6.8 cm ni menor a 0 cm");
                }
            }catch (InputMismatchException e){
                System.out.println("El tipo de dato ingresado no es el correcto");
                leer.nextLine();
            }
        }while (this.cola > 6.8 || this.cola < 0);

        do{
            try{
                System.out.println("Ingrese la velocidad del castor (maximo 8 km/hora)");
                this.velocidad = leer.nextDouble();
                if (this.velocidad > 8 || this.velocidad < 0) {
                    System.out.println("No puede ser mayor a 8 ni menor a 0 km/hora");
                }
            }catch(InputMismatchException e){
                System.out.println("El tipo de dato ingresado no es el correcto");
                leer.nextLine();
            }    
        }while (this.velocidad > 8 || this.velocidad < 0);

    }

    public double getCola() {
        return cola;
    }

    public void setCola(double cola) {
        this.cola = cola;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
