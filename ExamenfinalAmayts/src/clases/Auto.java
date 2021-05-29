/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

public class Auto extends Vehiculo{
    private int año;
    private double precio_compra;
    private double precio_venta;

    public Auto(int año, double precio_compra, double precio_venta) {
        this.año = año;
        this.precio_compra = precio_compra;
        this.precio_venta = precio_venta;
    }
    
    public Auto() {
    }

    public Auto(int placa, String marca, String modelo) {
        super(placa, marca, modelo);
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public double getPrecio_compra() {
        return precio_compra;
    }

    public void setPrecio_compra(double precio_compra) {
        this.precio_compra = precio_compra;
    }

    public double getPrecio_venta() {
        return precio_venta;
    }

    public void setPrecio_venta(double precio_venta) {
        this.precio_venta = precio_venta;
    }
    
    
    


    
}
