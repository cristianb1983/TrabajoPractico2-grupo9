package mainornitorrinco;

import java.util.InputMismatchException;
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
public class OrnitorrincoAzul extends Castor {

    private double propulsion; // 5 a 10 km/s (según consigna)

    public OrnitorrincoAzul(String nombre, double propulsion, double cola, double velocidad) {
        super(nombre, cola, velocidad);
        this.propulsion = propulsion;
    }

    @Override
    public void cargarDatos(Scanner leer) {
        do { 
            try { 
                System.out.println("Ingrese la longitud de la cola (entre 0-6.8 cm)");
                this.cola = leer.nextDouble();
                leer.nextLine();
                if (this.cola > 6.8 || this.cola < 0) {
                    System.out.println("No puede ser mayor a 6.8 cm ni menor a 0 cm");
                }
            } catch (InputMismatchException e) {
                System.out.println("El tipo de dato ingresado no es el correcto");
                leer.nextLine();
            }
        } while (this.cola > 6.8 || this.cola < 0);

        do {
            try {
                System.out.println("Ingrese la velocidad del ornitorrinco (maximo 8km/hora)");
                this.velocidad = leer.nextDouble();
                leer.nextLine();
                if (this.velocidad > 8 || this.velocidad < 0) {
                    System.out.println("No puede ser mayor a 8 ni menor a 0 km/hora");
                }
            } catch (InputMismatchException e) {
                System.out.println("El tipo de dato ingresado no es el correcto");
                leer.nextLine();
            }
        } while (this.velocidad > 8 || this.velocidad < 0);

        do {
            try {
                System.out.println("Ingrese la propulsino del castor (entre 5-10 km/)");
                this.propulsion = leer.nextDouble();
                leer.nextLine();
                if (this.propulsion > 10 || this.propulsion < 5) {
                    System.out.println("No puede ser mayor a 10 ni menor a 5 km/s");
                }
            } catch (InputMismatchException e) {
                System.out.println("El tipo de dato ingresado no es el correcto");
                leer.nextLine();
            }
        } while (this.propulsion > 10 || this.propulsion < 5);
    }
    
    @Override
    public void nadar() {
        double velocidadFinal = this.velocidad + this.propulsion;
        System.out.println(getNombre() + " nada a " + velocidadFinal + "km/hora");
    }

    public double getPropulsion() {
        return propulsion;
    }

    public void setPropulsion(double propulsion) {
        this.propulsion = propulsion;
    }

    @Override
    public String toString() {
        return "[OrnitorrincoAzul]" + " Nombre: " + nombre + " / Velocidad: " + velocidad + " / Propulsion: " + propulsion;
    }
}
