package com.company;

public class BeerHouse {
    private int cont;
    private boolean stock = Boolean.FALSE;

    public synchronized int get()
    {

        while (!stock) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.err.println("BeerHouse: Error en get -> " + e.getMessage());
            }
        }
        stock = Boolean.FALSE;
        notify();
        return cont;
    }

    public synchronized void put(int value) {
        while (stock) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.err.println("BeerHouse: Error en put -> " + e.getMessage());
            }
        }
        cont = value;
        stock = Boolean.TRUE;
        notify();
    }
}
