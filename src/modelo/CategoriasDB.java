/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import entidades.Categoria;
import java.util.ArrayList;

/**
 *
 * @author y
 */
public class CategoriasDB {
    public ArrayList<Categoria> getCategorias(){
        ArrayList<Categoria> lista= new ArrayList<>();
        lista.add(new Categoria(1,"Comestibles"));
        lista.add(new Categoria(2,"Limpieza"));
        lista.add(new Categoria(3,"Perfumeria"));
        return lista;        
    }
    
}
