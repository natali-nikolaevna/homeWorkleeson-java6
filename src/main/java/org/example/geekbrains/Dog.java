package org.example.geekbrains;

public class Dog extends Animal{
    int maxSwimDistance = 10;
    public Dog(String name){
        super(name);
        maxDistance = 500;
    }
    public void swim(int distance) {
        if(distance <= maxSwimDistance) {
            System.out.println("Животное " + name + " проплыло " + distance + " метров");
        }else {
            System.out.println("Это животное не может столько проплыть");
        }

    }
}
