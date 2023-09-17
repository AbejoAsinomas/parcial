package com.alejandromarquez.aplicacion;

import com.alejandromarquez.dominio.Dispensador;

public class Main {
    public static void main(String[] args) {
        Dispensador dispensador = new Dispensador();

        // Agregar productos
        dispensador.agregarProductoAM("Chocolatina Jet", 8, 1.5);
        dispensador.agregarProductoAM("Jugo Hit", 8, 3.0);
        dispensador.agregarProductoAM("Panela", 8, 2.5);
        dispensador.agregarProductoAM("Jumbo", 8, 2.0);
        dispensador.agregarProductoAM("Choclitos", 8, 4.5);
        dispensador.agregarProductoAM("Manimoto", 0, 1.0);
        dispensador.agregarProductoAM("Fourloko", 8, 1.5);
        dispensador.agregarProductoAM("Aguacates", 8, 5.0);


        // Resta los productos
        dispensador.sacarProductoAM("Chocolatina Jet");
        dispensador.sacarProductoAM("Chocolatina Jet");
        dispensador.sacarProductoAM("Chocolatina Jet");
        dispensador.sacarProductoAM("Chocolatina Jet");
        dispensador.sacarProductoAM("Manimoto");


        // Agotados
        dispensador.productosAgotadosAM();

        // Consultar cantidad de un producto
        int cantidadProducto2 = dispensador.consultarCantidadAM("Manimoto");
        System.out.println("Cantidad de Producto2: " + cantidadProducto2);

        // Consultar total de unidades
        dispensador.consultarTotalUnidadesAM();

        // Aumentar la cantidad de un producto
        dispensador.aumentarCantidadAM("Chocolatina Jet", 10);

        // Consultar total de unidades
        dispensador.consultarTotalUnidadesAM();
        // Mostrar precios de los productos
        dispensador.mostrarPreciosProductosAM();

        int totalUnidadesDisponibles = dispensador.calcularTotalUnidadesDisponiblesAM();
        System.out.println("Total de unidades disponibles: " + totalUnidadesDisponibles);



    }

}
