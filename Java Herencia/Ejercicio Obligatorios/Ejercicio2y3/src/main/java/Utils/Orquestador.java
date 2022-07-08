package Utils;

import Constantes.Constantes;
import Entidades.Electrodomestico;
import Entidades.Lavadora;
import Entidades.Televisor;
import java.util.ArrayList;
import java.util.Scanner;

public class Orquestador {

    public static final ArrayList<Electrodomestico> listaElectrodomesticos = new ArrayList<>();
    private static final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void metodoOrquestador() {

        int precioTeles = 0;
        int precioLavadoras = 0;
        int precioTotal;

        System.out.println(Constantes.CANTIDAD_LAVADORAS);

        int cantLavadoras = leer.nextInt();

        for (int i = 0; i < cantLavadoras; i++) {

            Lavadora newLavadora = new Lavadora();

            newLavadora.crearLavadora();
            newLavadora.mostrarLavadora();

            listaElectrodomesticos.add(newLavadora);

        }

        System.out.println(Constantes.CANTIDAD_TELES);

        int cantidadTelevisores = leer.nextInt();

        for (int i = 0; i < cantidadTelevisores; i++) {

            Televisor newTelevisor = new Televisor();

            newTelevisor.crearTelevisor();
            newTelevisor.mostrarTelevisor();

            listaElectrodomesticos.add(newTelevisor);
        }
        
        calcularPrecioFinal(precioLavadoras, precioTeles);

        precioTotal = precioTeles + precioLavadoras;

        System.out.println(Constantes.PRECIO_LAVADORAS + precioLavadoras);

        System.out.println(Constantes.PRECIO_TELES + precioTeles);

        System.out.println(Constantes.PRECIO_TOTAL + precioTotal);

    }

    public static void calcularPrecioFinal(int precioLavadoras, int precioTeles) {

        for (Electrodomestico aux : listaElectrodomesticos) {

            if (aux instanceof Lavadora) {

                precioLavadoras += aux.getPrecio();

            }

            if (aux instanceof Televisor) {

                precioTeles += aux.getPrecio();

            }

        }

    }

}