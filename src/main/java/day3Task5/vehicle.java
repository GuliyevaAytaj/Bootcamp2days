package day3Task5;

public class vehicle {
   private String typeOfVehicle;
    private String color;
    private String brandName;
    private int numberofWheels;
    private int yearOfProduction;

    public vehicle(){

        this.typeOfVehicle = typeOfVehicle;
        this.color = color;
        this.brandName = brandName;
        this.numberofWheels = numberofWheels;
        this.yearOfProduction = yearOfProduction;

    }

    public String getTypeOfVehicle() {
        return typeOfVehicle;
    }

    public void setTypeOfVehicle(String typeOfVehicle) {
        this.typeOfVehicle = typeOfVehicle;
        System.out.println("Your type of Vehicle is " + typeOfVehicle);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
        System.out.println("Your vehicle`s color is " + color);
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
        System.out.println("Your vehicle`s brand name is " + brandName);
    }

    public int getNumberofWheels() {
        return numberofWheels;
    }

    public void setNumberofWheels(int numberofWheels) {
        this.numberofWheels = numberofWheels;
        System.out.println("The number of wheel in your vehicle is " + numberofWheels);
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
        System.out.println("The production year of your vehicle is " + yearOfProduction);
    }

    // Create a base class of a Vehicle,
// then create a Car class which inherits from Vehicle class.
// Also, create another class, a specific type of Car that inherits from the Car class.
// Program should be able to handle steering, changing gears, and drive (having speed in other words).
// You might decide where to put the appropriate state and behaviours (fields and methods).
// As mentioned above, changing gears, increasing/decreasing speed of driving should be included.
//
//    public static class Car extends vehicle {
//
//        String typeOfFuel;
//        String typeOfTransmission;
//        int numberOfSeats;
//
//
//    }
}
