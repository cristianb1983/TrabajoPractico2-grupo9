package mainornitorrinco;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @autor Benegas Gonzalez Cristian Rene Claudio Mariano Mathot AYELEN GUADALUPE
 * AGÜERO Rodrigo Bordon Santiago González Milagros Gilda Alfaro José María
 * Urbani Julian Martin Esquiaga
 */
public class MainOrnitorrinco {

    public static final Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {

        OrnitorrincoVerde verde01 = new OrnitorrincoVerde("Alfaro");
        verde01.cargarDatos(leer);
        OrnitorrincoAzul azul01 = new OrnitorrincoAzul("blue");
        azul01.cargarDatos(leer);
        OrnitorrincoAzul azul02 = new OrnitorrincoAzul("blui");
        azul02.cargarDatos(leer);

        System.out.println("\nHabilidades de OrniVerde " + verde01.getNombre() + ": ");
        verde01.nadar();
        verde01.tocarGuitarra();
        verde01.tocarOrgano();
        verde01.tocarGuitorgan();

        System.out.println("\nHabilidades de OrniAzul " + azul01.getNombre() + ": ");
        azul01.nadar();
        azul01.tocarGuitarra();

        System.out.println("\nHabilidades de OrniAzul " + azul02.getNombre() + ": ");
        azul02.nadar();
        azul02.tocarGuitarra();
        
        Castor[] hermanosOrni = new Castor[3];
        try {
            hermanosOrni[0] = azul01;
            hermanosOrni[1] = verde01;
            hermanosOrni[2] = azul02;

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error de índice en el arreglo!");

        } finally {
            System.out.println("\nLos ornitohermanos estan juntos al fin…");
        }

        ArrayList<OrnitorrincoAzul> nadadores = new ArrayList();
        for (Castor Azul : hermanosOrni) {
            if (Azul instanceof OrnitorrincoAzul) {
                nadadores.add((OrnitorrincoAzul) Azul);
            }
        }

        nadadores.sort(new Comparator<OrnitorrincoAzul>() {
            @Override
            public int compare(OrnitorrincoAzul t, OrnitorrincoAzul t1) {
                return Double.compare(t.getPropulsion(), t1.getPropulsion());
            }
        });

        System.out.println("\nLista de nadadores por propulsión de nado ordenado de forma ascendente:");

        Iterator<OrnitorrincoAzul> it = nadadores.iterator();
        while (it.hasNext()) {
            OrnitorrincoAzul nadador = it.next();
            System.out.println("OrniAzul " + nadador.getNombre() + " Propulsión: " + nadador.getPropulsion());
        }

    }

}
