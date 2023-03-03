/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

import java.util.Scanner;

/**
 *
 * @author luibol
 */
public class Pelicula extends Multimedia {

    //Atributos Nuevos
    String actorPrincipal, actrizPrincipal;

    //Constructor
    public Pelicula(String actorPrincipal, String actrizPrincipal, String titulo, String autor, format formato, String duracion) throws Exception{
        super(titulo, autor, formato, duracion);

        if (actorPrincipal == null && actrizPrincipal == null) {
            throw new Exception("Debe de haber al menos un actor o actriz principal");
        }
        this.actorPrincipal = actorPrincipal;
        this.actrizPrincipal = actrizPrincipal;
    }
    //Setters

    public void setActorPrincipal(String actorPrincipal) {
        this.actorPrincipal = actorPrincipal;
    }

    public void setActrizPrincipal(String actrizPrincipal) {
        this.actrizPrincipal = actrizPrincipal;
    }
    //Getters

    public String getActorPrincipal() {
        return actorPrincipal;
    }

    public String getActrizPrincipal() {
        return actrizPrincipal;
    }

    //toString
    public String toString() {
        return "Pelicula{" + "actorPrincipal=" + actorPrincipal + ", actrizPrincipal=" + actrizPrincipal + super.toString() + '}';
    }
    
    //Metodo para insertar Peliculas
    public void insertPeliculas() {
        Scanner tcl = new Scanner (System.in);
        boolean erroneo;
        String actorPrincipal,actrizPrincipal,titulo,autor,duracion;
        format formato;
        
        do{
            erroneo = true;
            System.out.println("Introduce el titulo:");
            titulo = tcl.nextLine();
            
            System.out.println("Introduce el autor:");
            autor = tcl.nextLine();
            
        }while(erroneo);
    
    }

}
