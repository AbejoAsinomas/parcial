package com.alejandromarquez.dominio;

import java.util.HashMap;
import java.util.Map;

public class Dispensador {
    private Map<String, Producto> productos; // Almacena los productos por nombre

    public Dispensador() {
        this.productos = new HashMap<>();
    }

    public void agregarProductoAM(String nombre, int cantidadMaxima, double precio) {
        if (productos.size() < 10 && !productos.containsKey(nombre)) {
            Producto producto = new Producto(nombre, cantidadMaxima, precio);
            productos.put(nombre, producto);
        } else {
            System.out.println("No se puede agregar el producto, La máquina está llena o el producto ya existe.");
        }
        System.out.println("------------------------");
    }

    public void sacarProductoAM(String nombre) {
        Producto producto = productos.get(nombre);
        if (producto != null && producto.getCantidadAM() > 0) {
            producto.disminuirCantidadAM();
        } else {
            System.out.println("El producto no está disponible.");
        }
        System.out.println("------------------------");
    }

    public void productosAgotadosAM() {
        System.out.println("Productos agotados:");
        for (Producto producto : productos.values()) {
            if (producto.getCantidadAM() == 0) {
                System.out.println(producto.getNombreAM());
            }
        }
        System.out.println("------------------------");
    }

    public int consultarCantidadAM(String nombre) {
        Producto producto = productos.get(nombre);
        return producto != null ? producto.getCantidadAM() : 0;
    }

    public void consultarTotalUnidadesAM() {
        System.out.println("Inventario del dispensador:");
        for (Producto producto : productos.values()) {
            System.out.println(producto.getNombreAM() + ": " + producto.getCantidadAM() + " unidades disponibles");
        }
        System.out.println("------------------------");
    }

    public void aumentarCantidadAM(String nombre, int cantidad) {
        Producto producto = productos.get(nombre);
        if (producto != null) {
            producto.aumentarCantidadAM(cantidad);
        } else {
            System.out.println("El producto no está disponible.");
        }
        System.out.println("------------------------");
    }
    public int calcularTotalUnidadesDisponiblesAM() {
        int total = 0;
        for (Producto producto : productos.values()) {
            total += producto.getCantidadAM();
        }
        return total;
    }
    public void mostrarPreciosProductosAM() {
        System.out.println("Precios de los productos:");
        for (Producto producto : productos.values()) {
            System.out.println(producto.getNombreAM() + ": $" + producto.getPrecioAM());
        }
        System.out.println("------------------------");
    }
}
