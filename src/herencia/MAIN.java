/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

import herencia.Multimedia.format;
import java.util.Scanner;

/**
 *
 * @author luibol
 */
public class MAIN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListaMultimedia lista = new ListaMultimedia(50);
        int opcion;

        do {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Añadir película");
            System.out.println("2. Añadir disco");
            System.out.println("3. Salir");
            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    try{
                    System.out.println("Introduzca el actor principal:");
                    String actor = sc.nextLine();
                    System.out.println("Introduzca la actriz principal:");
                    String actriz = sc.nextLine();                  
                    System.out.println("Introduzca el título:");
                    String tituloP = sc.nextLine();
                    System.out.println("Introduzca el autor:");
                    String autorP = sc.nextLine();
                    System.out.println("Introduzca el formato:");
                        System.out.println("Tipos de formato:");
                        System.out.println("vav, mp3, midi, avi, mov, mpg, cdAudio, dvd");
                        format formatoP = format.valueOf(sc.nextLine());
                    System.out.println("Introduzca la duración:");
                    String duracionP = sc.nextLine();
                    Pelicula pelicula = new Pelicula(actor, actriz, tituloP, autorP, formatoP, duracionP);
                     lista.add(pelicula);
                    }catch(Exception e){
                        System.out.println(e.getMessage());
                    }
                   
                   
                    break;
                case 2:
                    System.out.println("Introduzca el género:");
                    String genero = sc.nextLine();
                    System.out.println("Introduzca el título:");
                    String tituloD = sc.nextLine();
                    System.out.println("Introduzca el autor:");
                    String autorD = sc.nextLine();
                    System.out.println("Introduzca el formato:");
                         System.out.println("Tipos de formato:");
                         System.out.println("vav, mp3, midi, avi, mov, mpg, cdAudio, dvd");
                    format formatoD = format.valueOf(sc.nextLine());
                    System.out.println("Introduzca la duración:");
                    String duracionD = sc.nextLine();
                    Disco disco = new Disco(genero, tituloD, autorD, formatoD, duracionD);
                    lista.add(disco);
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion != 3);

        System.out.println("Lista de multimedia:");
        System.out.println(lista.toString());
    }
}

    

