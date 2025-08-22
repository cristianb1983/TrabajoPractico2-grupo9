/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ornitorrinco;

import java.util.Scanner;

/**
 *
 * @author 
 */
public class OrniVerde extends Castor implements Pata{
    private String nombre;    
    Scanner leer = new Scanner(System.in);
    
    public OrniVerde(String nombre, double cola, double velocidad) {
        super(cola, velocidad);
        this.nombre=nombre;
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
