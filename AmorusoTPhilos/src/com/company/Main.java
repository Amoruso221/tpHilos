package com.company;


public class Main {

    private static BeerHouse beerHouse;
    private static Thread beerProducter;
    private static Thread [] beerConsumer;
    private static final int cantConsumidores = 5;

    public static void main(String[] args) {
	    beerHouse = new BeerHouse();
	    beerProducter = new Thread(new BeerProducter(beerHouse,1));
	    beerConsumer = new Thread[cantConsumidores];

	    for(int i=0; i < cantConsumidores; i++)
        {
            beerConsumer[i] = new Thread(new BeerConsumer(beerHouse, i));
            beerConsumer[i].start();
        }
        beerProducter.start();
    }
}
