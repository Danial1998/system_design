package liskov_substituition_principle;

abstract class Vehicle {
    public abstract void startEngine();
    public abstract void stopEngine();
    public abstract void move();
}

//Sure, here's an example of the Liskov Substitution Principle (LSP)
// using a Vehicle class and its subclasses: Car, Bicycle, and Motorcycle.
//
//The Liskov Substitution Principle states that objects of a
// superclass should be replaceable with objects of its subclasses
// without affecting the correctness of the program. In other words,
// if class S is a subclass of class T, then objects of type T should
// be replaceable with objects of type S without altering the desirable
// properties of the program.

