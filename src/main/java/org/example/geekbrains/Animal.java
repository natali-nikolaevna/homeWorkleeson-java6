package org.example.geekbrains;

public class Animal {
    String name;
    int maxDistance;

    public Animal (String name) {
        this.name = name;
    }

    public void animalInfo() {
        System.out.println("Животное:" + name);
    }
    public void run(int distance) {
        if(distance <= maxDistance) {
            System.out.println("Животное " + name + " пробежало " + distance + " метров");
        }else {
            System.out.println("Это животное не может столько пробежать");
        }
    }
}

