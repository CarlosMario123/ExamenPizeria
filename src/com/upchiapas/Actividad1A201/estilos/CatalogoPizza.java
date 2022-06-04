package com.upchiapas.Actividad1A201.estilos;

import java.util.LinkedList;

public class CatalogoPizza {
    Pizza pizza1 = new Pizza("peperoni",170);
    Pizza pizza2 = new Pizza("hawayana",150);
    Pizza pizza3 = new Pizza("mexicana",150);
    private Pizza[] pizzas = {pizza1,pizza2,pizza3};


public CatalogoPizza(){

    }

    public Pizza[] getPizzas(){
        return pizzas;
    }
}
