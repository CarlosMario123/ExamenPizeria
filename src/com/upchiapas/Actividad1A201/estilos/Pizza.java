package com.upchiapas.Actividad1A201.estilos;

public class Pizza {
    private String nombre;
    private int precio;
    private Pizza PizzaDelCatalago[];
    public  Pizza(String nombres, int precios){
        this.nombre=nombres;
        this.precio=precios;
    }
    public Pizza(){
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public Pizza SendPizza(byte opcion){
        CatalogoPizza catalago = new CatalogoPizza();
        PizzaDelCatalago = catalago.getPizzas();
        return PizzaDelCatalago[opcion - 1];
    }
}
