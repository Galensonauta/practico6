/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author y
 */
public class Producto implements Comparable<Producto>{
    private int codigo,stock;
    private String descripcion;
    private double precio;
    private Categoria categoria;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Producto(int codigo, int stock, String descripcion, double precio, Categoria categoria) {
        this.codigo = codigo;
        this.stock = stock;
        this.descripcion = descripcion;
        this.precio = precio;
        this.categoria = categoria;
    }

    public Producto() {
    }

    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", stock=" + stock + ", descripcion=" + descripcion + ", precio=" + precio + ", categoria=" + categoria + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 31 * hash + this.codigo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Producto other = (Producto) obj;
        if(this.codigo != other.codigo){
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Producto o) {
        if(codigo== o.codigo){
            return 0;
        }else if(codigo>o.codigo){
            return 1;
        }else{
            return -1;
        }
    }
    
    
}
