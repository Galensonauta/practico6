/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import entidades.Categoria;
import entidades.Producto;
import java.util.ArrayList;

/**
 *
 * @author y
 */
public class ProductosDB {
    private ArrayList<Producto> lista= new ArrayList<>();
    
    public void guardarProducto(Producto p){
        p.setCodigo(lista.size()+1);
        lista.add(p);
    }
    public ArrayList<Producto> getProductos(){
        return lista;
    }
    public void borrarProducto(Producto p){
        lista.remove(p);
    }
    public void modificarProducto(Producto pn){
        for(Producto p:lista){
            if(p.getCodigo()== pn.getCodigo()){
                p.setDescripcion(pn.getDescripcion());
                p.setPrecio(pn.getPrecio());
                p.setCategoria(pn.getCategoria());
                p.setStock(pn.getStock());

                break;
            }
        }
    }
    
    
}
