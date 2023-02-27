/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author luibol
 * 
 */
public class Multimedia {

    //Atributos
    protected String titulo, autor, duracion;
    protected format formato;

    //Constructor con parametros
    public Multimedia(String titulo, String autor, format formato, String duracion) {
        this.titulo = titulo;
        this.autor = autor;
        this.formato = formato;
        this.duracion = duracion;

    }
    //Setters

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setFormato(format formato) {
        this.formato = formato;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    //Getters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public format getFormato() {
        return formato;
    }

    public String getDuracion() {
        return duracion;
    }

    //ToString
    public String toString() {
        return "Multimedia{" + "titulo:" + titulo + ", autor:" + autor + ", formato:" + formato + ", duracion:" + duracion + '}';
    }

    //Metodo equals
    public Boolean equals(Multimedia a) {

        Boolean igual = false;

        if (a.getTitulo().equalsIgnoreCase(this.getTitulo()) && a.getAutor().equalsIgnoreCase(this.getAutor())) {
            igual = true;
        } else {
            igual = false;

        }
        return igual;
    }

     public enum format {
        wav, mp3, midi, avi, mov, mpg, cdAudio, dvd

    }

}
