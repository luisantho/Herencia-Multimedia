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
    ArrayList<Multimedia> listaMulti = new ArrayList();
    int numObj;

    //Constructor
    public ListaMultimedia(int numObj) {
        this.numObj = numObj;
    }

    //Metodo para saber la cantidad de objetos que hay dentro del arrayList
    public int numeroObjetos(int numObj) {
        int cont = 0;
        for (int i = 0; i < listaMulti.size(); i++) {
            cont++;
            numObj = cont;
        }
        return numObj;

    }

}
