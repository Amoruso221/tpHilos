# tpHilos

* De la manera que se planteo el TP el productor y el consumidor producen y consumen un numero aleatorio entre 0 y 100 litros. En el caso de que no haya litros disponibles o la cantidad que se vaya a consumir sea mayor a los litros disponibles, los consumidores quedaran en espera a que el productor (unico) aumente la cantidad de litros disponibles y notifique. En ningun caso se cortan los hilos. El productor quedara en espera solamente cuando la cantidad de litros sea mayor o igual a 100 litros.

* Los bloques deben ser synchronized para acceder al recurso compartido uno a la vez, y en el caso del TP, sumar o restar litros de cerveza de manera aislada notificando posteriormente la liberacion del recurso.

* Se le llama recurso compartido a las zonas de memoria en donde varios threads, que se ejecutan concurrentemente, van a querer acceder.

* Se pueden crear threads de dos formas distintas.

1.- Declarar una subclase de Thread
2.- Implementar la interface Runnable y luego redefinir los metodos run() y start()

