package com.company;

public class BeerConsumer implements Runnable{

    private final BeerHouse beerHouse;
    private final int idconsumidor;

    public BeerConsumer(BeerHouse beerHouse, int idconsumidor)
    {
        this.beerHouse = beerHouse;
        this.idconsumidor = idconsumidor;
    }

    @Override
    public void run() {
        while(Boolean.TRUE)
        {
            System.out.println("El consumidor " + idconsumidor + " consume: " + beerHouse.get());
        }
    }
}
