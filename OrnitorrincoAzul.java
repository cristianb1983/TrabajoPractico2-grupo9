package mainornitorrinco;

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
    
    private String nombre;
    private double propulsion;
    
    Scanner leer = new Scanner(System.in);

    public OrnitorrincoAzul(String nombre, double propulsion, double cola, double velocidad) {
        super(cola, velocidad);
        this.nombre = nombre;
        this.propulsion = propulsion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPropulsion() {
        return propulsion;
    }

    public void setPropulsion(double propulsion) {
        this.propulsion = propulsion;
    }
    
    @Override
    public void nadar(){
        double velocidadfinal = velocidad + propulsion;
        System.out.println(getNombre() + " nada a " + velocidadfinal + " km/hora");
    }
    @Override
    public String toString() {
        return "[OrnitorrincoAzul]" + " Nombre: " + nombre + " / Velocidad: " + velocidad + " / Propulsion: " + propulsion;
    }

}
