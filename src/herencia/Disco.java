/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author luibol
 */
public class Disco extends Multimedia {
    protected String genero;
    
    //Constructor

    public Disco(String genero, String titulo, String autor, format formato, String duracion) {
        super(titulo, autor, formato, duracion);
        this.genero = genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    @Override
    public String toString() {
        return super.toString()+"\nGenero:" +genero +"\n";
    }
    
    
}
