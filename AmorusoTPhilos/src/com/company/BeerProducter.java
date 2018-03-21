package com.company;

import java.util.Random;

public class BeerProducter implements Runnable{

    private final Random aleatorio;
    private final BeerHouse beerHouse;
    private  final int idproductor;
    private final int tiempoEspera = 1500;

    public BeerProducter(BeerHouse beerHouse, int idproductor)
    {
        this.beerHouse =beerHouse;
        this.idproductor = idproductor;
        aleatorio = new Random();
    }

    @Override
    public void run() {
        while(Boolean.TRUE)
        {
            int poner = aleatorio.nextInt(10);
            beerHouse.put(poner);
            System.out.println("El productor " + idproductor + " pone: " + poner);
            try {
                Thread.sleep(tiempoEspera);
            } catch (InterruptedException e) {
                System.err.println("Productor " + idproductor + ": Eror en run -> " + e.getMessage());
            }
        }
    }
}
