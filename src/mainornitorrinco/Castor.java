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
    
    public Castor(String nombre) {
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
                System.out.println("Ingrese la longitud de la cola en (cm) de: "+nombre + ": ");
                this.cola = leer.nextDouble();
                if (this.cola <= 0){
                    System.out.println("La longitud de la cola debe ser mayor a 0cm");
                }
            }catch (InputMismatchException e){
                System.out.println("El tipo de dato ingresado no es el correcto");
            } finally {
                leer.nextLine();
            }
        }while (this.cola <= 0);

        do{
            try{
                System.out.println("Ingrese la velocidad (máximo 8km/hora) de: "+nombre +": ");
                this.velocidad = leer.nextDouble();
                if (this.velocidad > 8 || this.velocidad <= 0) {
                    System.out.println("No puede ser mayor a 8km/h ni menor a 0.1 km/hora");
                }
            }catch(InputMismatchException e){
                System.out.println("El tipo de dato ingresado no es el correcto");
            }finally{
                leer.nextLine();
            }    
        }while (this.velocidad > 8 || this.velocidad <= 0);

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
