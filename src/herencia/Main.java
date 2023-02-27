/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author luibol
 */
public class Main {

    public static void main(String[] args) {
        //Se crea un objeto de tipo ListaMultimedia
        ListaMultimedia ListaMultimedia = new ListaMultimedia(10);

        //Se crean 3 peliculas
        try {
            Pelicula Batman = new Pelicula("Batman Begins", "Bruce Wayne", format.mp3, "124", "Gerard Butler", "Jennifer Lawrence");
            Pelicula Superman = new Pelicula("Superman Returns", "Steven Spielber", format.wav, "132", "Richard Gere", "Jennifer Anniston");
            Pelicula Torrente = new Pelicula("Torrente", "Santiago Segura", format.dvd, "96", "Santiago Segura", "Neus Asensi");

            //Añadimos a la lista
            ListaMultimedia.add(Batman);
            ListaMultimedia.add(Superman);
            ListaMultimedia.add(Torrente);

            //
            int pos = ListaMultimedia.indexOf(Torrente);
            System.out.println("Posicion:" + pos);
            System.out.println(ListaMultimedia.get(pos));
            
        } catch (Exception x) {
            System.out.println("Datos incorrectos. Lista no creada");
        }
        
        //Se muestra la lista por pantalla
        System.out.println(ListaMultimedia);
    }
    
}
