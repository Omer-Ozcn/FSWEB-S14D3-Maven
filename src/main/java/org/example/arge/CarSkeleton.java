package org.example.arge;

public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton() {
    }

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public void startEngine() {
        System.out.println("CarSkeleton startEngine");
    }

    public void drive() {
        System.out.println("CarSkeleton drive");
        runEngine();
    }

    protected void runEngine() {
        System.out.println("CarSkeleton runEngine");
    }
}
