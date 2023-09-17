package com.alejandromarquez.dominio;

public class Producto {
    private String nombre;
    private int cantidad;
    private double precio;

    public Producto(String nombre, int cantidadMaxima, double precio) {
        this.nombre = nombre;
        this.cantidad = cantidadMaxima;
        this.precio = precio;
    }

    public String getNombreAM() {
        return nombre;
    }

    public int getCantidadAM() {
        return cantidad;
    }

    public double getPrecioAM() {
        return precio;
    }

    public void disminuirCantidadAM() {
        if (cantidad > 0) {
            cantidad--;
        }
    }

    public void aumentarCantidadAM(int cantidad) {
        if (this.cantidad + cantidad <= 8) {
            this.cantidad += cantidad;
        } else {
            System.out.println("No se puede aumentar la cantidad. Límite de stock alcanzado.");
        }
    }
}