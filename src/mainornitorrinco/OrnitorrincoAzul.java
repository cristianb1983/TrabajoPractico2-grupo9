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

    private double propulsion;

    public OrnitorrincoAzul(String nombre) {
        super(nombre);
    }
   
    @Override
    public void cargarDatos(Scanner leer) {
        super.cargarDatos(leer);

        do {
            try {
                System.out.println("Ingrese la propulsión (entre 5-10 km/) de "+nombre+": ");
                this.propulsion = leer.nextDouble();
                if (this.propulsion > 10 || this.propulsion < 5) {
                    System.out.println("No puede ser mayor a 10km/h ni menor a 5 km/s");
                }
            } catch (InputMismatchException e) {
                System.out.println("El tipo de dato ingresado no es el correcto");
            } finally {
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
