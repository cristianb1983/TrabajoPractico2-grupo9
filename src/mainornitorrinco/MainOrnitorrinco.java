package mainornitorrinco;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
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

public class MainOrnitorrinco {

      public static void main(String[] args){
           
     Scanner sn = new Scanner(System.in);

        System.out.println("------CREANDO ORNITORRINCOS------");

        System.out.println("---Creando Ornitorrinco VERDE---");
        double velocidad;

        System.out.println("Ingrese la velocidad del OrniVerde:(Hasta 8km/s)");
        velocidad = sn.nextDouble();

        double cola;
        System.out.println("Ingrese la Longitud de cola del OrniVerde:");
        cola = sn.nextDouble();
        
        
        
      

        System.out.println("---Creando Ornitorrinco AZUL Blue---");

        double propursion;
        System.out.println("Ingrese la propulsion de Blue al nadar:(5 a 10km/s)");
        propursion = sn.nextDouble();

        System.out.println("Ingrese la Longitud de cola de Blue:");
        cola = sn.nextDouble();

        System.out.println("Ingrese la velocidad de Blue:(5 a 10km/s)");
        velocidad = sn.nextDouble();



        System.out.println("---Creando Ornitorrinco AZUL Blui---");

        System.out.println("Ingrese la propulsion del Ornitorrinco Azul al nadar:(5 a 10km/s)");
        propursion = sn.nextDouble();

        System.out.println("Ingrese la Longitud de cola de Blui:");
        cola = sn.nextDouble();

        System.out.println("Ingrese la velocidad de Blui:(5 a 10km/s)");
        velocidad = sn.nextDouble();

        System.out.println("---HABILIDADES DE LOS ORNITORRINCOS---");
        
        System.out.println("--Ornitorrinco Verde:--");

        OrnitorrincoVerde orniVerde = new OrnitorrincoVerde("Alfaro", cola, velocidad);
        orniVerde.nadar();
        orniVerde.tocarGuitarorgan();
        

        System.out.println("--Ornitorrinco Blue Azul:--");
        OrnitorrincoAzul OrniAzul1 = new OrnitorrincoAzul("Blue", propursion, cola, velocidad);
        OrniAzul1.nadar();
        OrniAzul1.tocarGuitarra();;

        
        System.out.println("--Ornitorrinco Blui Azul:--");
        OrnitorrincoAzul OrniAzul2 = new OrnitorrincoAzul("Blui", propursion, cola, velocidad);
        OrniAzul2.nadar();
        OrniAzul2.tocarGuitarra();
        
        try{
            
        
        Castor [] Ornitorrincos = new Castor[3];
        Ornitorrincos[0] = OrniAzul1;
        Ornitorrincos[1] = orniVerde;
        Ornitorrincos[2] = OrniAzul2;
        
        System.out.println("Lista:");
            for (int i = 0; i < Ornitorrincos.length; i++) {
                System.out.println(Ornitorrincos[i] + "Posicion:" + i );
                
            }
        }catch(ArrayIndexOutOfBoundsException e ){
            System.out.println("invalido");
            
        }finally{
            System.out.println("Los Ornitorrincos estan juntos al fin...");
        }
        
       
        ArrayList<Castor> nadadores = new ArrayList();
        for (Castor Azul : nadadores) {
            if(Azul instanceof OrnitorrincoAzul){
                nadadores.add((OrnitorrincoAzul) Azul);  
            } 
            
            
          System.out.println("Lista de Nadadores:");
            Iterator <Castor> it = nadadores.iterator();
            while(it.hasNext()){
        OrnitorrincoAzul nadador = (OrnitorrincoAzul) it.next();
        System.out.println(nadador.getNombre() + "Propulsión: " + nadador.getPropulsion());
            }
      
  
    }
            
           
            
            
        }
           
}

    
    
    

