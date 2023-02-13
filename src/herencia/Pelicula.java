/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author luibol
 */
public class Pelicula extends Multimedia {

    //Atributos Nuevos
    String actorPrincipal, actrizPrincipal;

    //Constructor
    public Pelicula(String actorPrincipal, String actrizPrincipal, String titulo, String autor, String formato, double duracion) {
        super(titulo, autor, formato, duracion);

        if (actorPrincipal == null && actrizPrincipal == null) {
            throw new IllegalArgumentException("Debe de haber al menos un actor o actriz principal");
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

}
