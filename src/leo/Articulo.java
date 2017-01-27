/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leo;
public class Articulo {
    public int sku;
    private int existencia;
    private double precio;
    private double costo;
    public String descripcion;
    
    public Articulo(int sku, double price, String description){
        this.sku=sku;
        this.existencia=0;
        this.precio=precio;
        this.costo=0;
        this.descripcion=descripcion;  
    }
     public Articulo(){
        this.sku=00000000;
        this.existencia=0;
        this.precio=0;
        this.costo=0;
        this.descripcion="n/a";
    }
    public void compra(int cant, double cost){
        this.existencia+=cant;
        this.costo+=cost;
    }
    public boolean venta(int cantidad){
        if(cantidad>0&&cantidad<this.existencia){
            this.existencia-=cantidad;
            return true;
        } else return false;
    }
    public int verificarExistencia(){
        return this.existencia;
    }
    public void actualizaPrecio(double precio){
        if(precio>0) this.precio=precio;
    }
}


    

