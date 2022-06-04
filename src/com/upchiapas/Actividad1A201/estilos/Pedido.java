package com.upchiapas.Actividad1A201.estilos;

public class Pedido {
    Cliente cliente;
    byte opcion;

    public Pedido(Cliente cliente, byte opcion) {
        this.cliente = cliente;
        this.opcion = opcion;
    }

    public Pizza SendPizza(){
        Pizza pizza1 = new Pizza();
        return pizza1.SendPizza(opcion);
    }
    public Cliente getCliente(){
        return cliente;
    }



}
