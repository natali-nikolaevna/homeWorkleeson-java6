package org.example.geekbrains;

import java.awt.geom.FlatteningPathIterator;

public class Main {
    public static void main(String[] args) {
        Cat lada = new Cat("Lada");
        lada.run(201);
        Cat bonya = new Cat("Bonya");
        bonya.run(150);
        Cat lapa = new Cat("Lapa");
        lapa.run(100);

        Dog volk = new Dog("Volk");
        volk.swim(10);
        volk.run(250);
        Dog volf = new Dog("Volf");
        volf.swim(9);
        volf.run(55);
        Dog willy = new Dog("Willy");
        willy.swim(15);
        willy.run(260);
    }
}