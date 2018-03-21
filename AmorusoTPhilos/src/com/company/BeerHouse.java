package com.company;

public class BeerHouse {
    private int litros;

    public synchronized int get(int value)
    {

        while (litros<=0 || (litros-value)<=0) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.err.println("BeerHouse: Error en get -> " + e.getMessage());
            }
        }
        litros = litros - value;
        notifyAll();
        return litros;
    }

    public synchronized void put(int value) {
        while (litros>=100) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.err.println("BeerHouse: Error en put -> " + e.getMessage());
            }
        }
        litros = litros + value;
        notifyAll();
    }
}
