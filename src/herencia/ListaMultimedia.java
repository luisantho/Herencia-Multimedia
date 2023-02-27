/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

import java.util.ArrayList;

/**
 *
 * @author luibol
 */
public class ListaMultimedia {

    //Atributos
    private Multimedia[] lista;
    private int total = 0;

    //Constructor que recibe como parametro un entero indicando el numero maximo
    public ListaMultimedia(int x) {
        lista = new Multimedia[x];
    }

    //devuelve el numero de objetos que hay en la lista
    public int size() {
        return total;
    }

    //añade el objeto al final de la lista
    public boolean add(Multimedia a) {
        if (total < lista.length) {
            lista[total] = a;
            total++;
            return true;

        } else {
            return false;
        }

    }

    //devuelve el objeto situado en la posicion especificada
    public Multimedia get(int pos) {
       return lista[pos];
    }
    
    //e)devuelve la posición del objeto que se introduce por parámetro, si no se encuentra, devolverá -1.
    public int indexOf (Multimedia m){
        for (int i = 0; i < lista.length; i++) {
            if(lista[i].equals(m)){
                return i;
            }
        }
        return -1;
    
    }
    
    //f 
    public String toString(){
        String resultado = "";
        
        for (int i = 0; i < this.size(); i++) {
            resultado = resultado + "\nMultimedia ["+ i +"]: \n"+this.get(i).toString() + "\n";
        }
        return resultado;
    
    }

}
