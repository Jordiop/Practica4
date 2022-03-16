package Animales;

import Vehiculos.Barco;
import Humanos.Adulto;
import Humanos.Juguete;
import Humanos.Niño;
import java.util.Scanner;
import java.util.Date;

/**
 *
 * @author jordi
 */
public class diagramaClasesMain {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        //OBJETO 'niñoRata1' DE CLASE 'Niño'
        Niño niñoRata1 = new Niño("Escola random", "Bart", "1111A", 15);
        System.out.println(niñoRata1.toString());

        //OBJETO 'spinner' DE CLASE 'Juguete'
        Juguete spinner = new Juguete("Spinner", 5, 6);
        System.out.println(spinner.toString());

        //METODO ENSAMBLADOR
        niñoRata1.ensamblador(spinner);
        System.out.println(niñoRata1.toString());

        //OBJETO 'adulto1 DE CLASE 'Adulto'
        Adulto adulto1 = new Adulto("aaa111", "address", "name", "2222B", 30);
        System.out.println(adulto1.toString());

        //OBJETO 'titanic' DE CLASE 'Barco'
        //INICIALIZA OBJETO 'motor' DE CLASE 'Motor' EN EL CONSTRUCTOR COMPLETO DE CLASE 'Barco'
        Barco titanic = new Barco("Titanic", "1909/09/31", 200, "lego", "2000 cv", 1234);
        System.out.println(titanic.toString());

        System.out.println("Describe el sonido del motor: ");
        //INVOCANDO METODO 'sonido' DE INTERFAZ 'Sonido' CON OBJETO 'titanic' DE CLASE 'Barco'
        String ruido = new String(keyboard.nextLine());
        System.out.println(titanic.sonido(ruido));

        //INVOCANDO METODO 'sonido' DE INTERFAZ 'Sonido' CON OBJETO 'max' DE CLASE 'Perro'
        Perro max = new Perro("Pastor aleman", "Max", 8);
        System.out.println(max.toString());

        System.out.println("Describe el sonido del perro: ");
        System.out.println(max.sonido(keyboard.nextLine()));

        //INVOCANDO METODO 'sonido' DE INTERFAZ 'Sonido' CON OBJETO 'garfield' DE CLASE 'Gato'
        Gato garfield = new Gato("Garfield", 4, "naranja");
        System.out.println(garfield.toString());

        System.out.println("Describe el sonido del gato: ");
        System.out.println(garfield.sonido(keyboard.nextLine()));

        
    }
;
};
