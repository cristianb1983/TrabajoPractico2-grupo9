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

public class OrnitorrincoVerde extends Castor implements Pata {

    private final Scanner leer = new Scanner(System.in);

    public OrnitorrincoVerde(String nombre, double cola, double velocidad) {
        super(nombre, cola, velocidad);
    }
    
    @Override
    public void tocarOrgano() {
        System.out.println("Do-Re-Mi");
        System.out.println("Presione enter para continuar...");
        leer.nextLine();
        System.out.println("Fa-Sol-La-Si");
    }

   public void tocarGuitarorgan(){
    super.tocarGuitarra();
    tocarOrgano();
       System.out.println("cuac, cuaac..!");
}

    @Override
    public String toString() {
        return "OrniVerde{" + "nombre=" + nombre + '}';
    }

    
}
