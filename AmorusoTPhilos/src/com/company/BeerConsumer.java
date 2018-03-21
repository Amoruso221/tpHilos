package com.company;

import java.util.Random;

public class BeerConsumer implements Runnable{

    private final BeerHouse beerHouse;
    private final int idconsumidor;
    private final Random aleatorio;

    public BeerConsumer(BeerHouse beerHouse, int idconsumidor)
    {
        this.beerHouse = beerHouse;
        this.idconsumidor = idconsumidor;
        aleatorio = new Random();
    }

    @Override
    public void run() {
        while(Boolean.TRUE)
        {
            int consumir = aleatorio.nextInt(100);
            System.out.println("El consumidor " + idconsumidor + " consume: " + beerHouse.get(consumir));
        }
    }
}
