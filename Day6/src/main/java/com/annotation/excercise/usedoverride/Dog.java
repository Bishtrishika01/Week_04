package com.annotation.excercise.usedoverride;

//Child class Dog
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}
