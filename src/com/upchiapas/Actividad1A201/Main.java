 package com.upchiapas.Actividad1A201;
import com.upchiapas.Actividad1A201.estilos.Pedido;
import com.upchiapas.Actividad1A201.estilos.Pizza;
import com.upchiapas.Actividad1A201.estilos.Tienda;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Bievenido a las mejores pizzas");
            System.out.println("que desea hacer");
            System.out.println("");
            System.out.println("1) ordenar");
            System.out.println("2) salir ");
            System.out.println("Opcion: ");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    Ordenar();
                    break;
                case 2:
                    System.out.println("NOS VEMOS....");
                    break;
                default:
                    System.out.println("LO SENTIMOS, INTENTA DE NUEVO....");
            }
        }while (opcion !=2);

    }
    public static void Ordenar(){
        String nombre;
        byte opcion;
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingrese su nombre");
        nombre = teclado.nextLine();
        do {
            System.out.println("1)Peperoni");
            System.out.println("2)hawayana");
            System.out.println("3)mexicana");
            opcion = teclado.nextByte();
        }while(opcion < 1 || opcion > 3);
        Tienda tienda = new Tienda(opcion,nombre);

        System.out.println("**********************************************************");
        System.out.println("cliente: " + tienda.SendPedido().getCliente().getNombrecliente());
        System.out.println("precio: " + tienda.SendPedido().SendPizza().getPrecio());
        System.out.println("nombre pizza: " + tienda.SendPedido().SendPizza().getNombre());
        System.out.println("***********************************************************");
    }
    }
