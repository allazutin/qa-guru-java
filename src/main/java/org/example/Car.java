package org.example;

public class Car {
    String brand;
    String model;
    String color;
    int horsepower;
    int torque;

    public Car(String brand, String model, String color, int horsepower, int torque) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.horsepower = horsepower;
        this.torque = torque;
    }

    void ChangeColor(String color) {
        this.color = color;
    }

    public String GetColor() {
        return this.color;
    }
    public int GetHorsePower() {
        return this.horsepower;
    }
    public int GetTorque() {
        return this.torque;
    }
}

