package com.upchiapas.Actividad1A201.estilos;

public class Tienda {
    Pedido pedido;
    byte opcion;
    String nombre;
    Cliente cliente;

    public Tienda(byte opcion, String nombre) {

        this.opcion = opcion;
        this.nombre = nombre;
    }
    public Pedido SendPedido(){
        return pedido = new Pedido(cliente = new Cliente(nombre),opcion);
    }
}
