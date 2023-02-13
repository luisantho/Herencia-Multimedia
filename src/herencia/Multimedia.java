/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author luibol
 */
public class Multimedia {

    //Atributos
    protected String titulo, autor, formato;
    protected double duracion;

    //Constructor con parametros
    public Multimedia(String titulo, String autor, String formato, double duracion) {
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

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }
    
    //Getters

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getFormato() {
        return formato;
    }

    public double getDuracion() {
        return duracion;
    }
    
    //ToString

    public String toString() {
        return "Multimedia{" + "titulo:" + titulo + ", autor:" + autor + ", formato:" + formato + ", duracion:" + duracion + '}';
    }
    
    //Metodo equals
    
   // public static Boolean metodoEquals(Multimedia a){
        
        Boolean correcto;
            //if(Multimedia instaceof )
        
    
    
    //}
   
}
