package org.example;
import java.time.Year;


class Vehicle {

    String brand;
    String model;
    int year;


    public Vehicle(String brand, String model, int year) throws InvalidYearException {
       if(year > Year.now().getValue()){
           throw new InvalidYearException("Year is not valid:" + year);
       }

        this.brand = brand;
        this.model = model;
        this.year = year;
    }


    public void vehicleSound() {
        System.out.println("The vehicle makes a sound");
    }


    public void displayDetails() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Year: " + year);
    }
}


class Car extends Vehicle {


    public Car(String brand, String model, int year) throws InvalidYearException {
        super(brand, model, year);
    }


    @Override
    public void vehicleSound() {
        System.out.println("The car goes brumm!");
    }
}


class Motorcycle extends Vehicle {


    public Motorcycle(String brand, String model, int year) throws InvalidYearException {
        super(brand, model, year);
    }


    @Override
    public void vehicleSound() {
        System.out.println("The motorcycle V4 goes screaming");
    }
}


public class Main {
    public static void main(String[] args) {

        try {

            Car car = new Car("Toyota", "Yaris", 2024);
            Motorcycle motorcycle = new Motorcycle("Harley-Copper", "Street 750", 2021);


            car.displayDetails();
            car.vehicleSound();

            motorcycle.displayDetails();
            motorcycle.vehicleSound();

            System.out.println("Success Create New List Car & Motorcycle");

        } catch (InvalidYearException e) {
            System.out.println(e.getMessage());
        }

    }
}
