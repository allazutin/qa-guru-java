package org.example;

public class Run {
    public static void main(String[] args) {
        Car bmw = new Car("bmw", "3er", "red", 177, 300);
        Car audi = new Car("audi","a3","white",122,220);
        System.out.println(bmw.GetColor());
        bmw.ChangeColor("green");
        System.out.println(bmw.GetColor());

        if ((bmw.GetHorsePower() > audi.GetHorsePower()) && (bmw.GetTorque() > audi.GetTorque())) {
            System.out.println("bmw is more powerful then audi");
        } else {
            System.out.println("bmw is less powerful then audi");
        }
    }
}
