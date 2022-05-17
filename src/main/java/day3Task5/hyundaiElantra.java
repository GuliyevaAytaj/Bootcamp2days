package day3Task5;

public class hyundaiElantra {


    public static void main(String[] args) {
        car myNewCar = new car();
        myNewCar.setTypeOfVehicle("Car");
        myNewCar.setBrandName("Hundai Elantra");
        myNewCar.setColor("Grey");
        myNewCar.setNumberofWheels(4);
        myNewCar.setNumberOfSeats(4);
        myNewCar.setTypeOfFuel("Benzin");
        myNewCar.setTypeOfTransmission("Automatic");
        myNewCar.setYearOfProduction(2020);
        myNewCar.setMinSpeed(0);
        myNewCar.setMaxSpeed(240);
        myNewCar.isCarTurnOn(true);
        myNewCar.setSpeed(0);
        myNewCar.gearDrive(true);
        myNewCar.increaseSpeed(60);
        myNewCar.driveLeft(true);
        myNewCar.decreaseSpeed(20);
        myNewCar.driveRight(true);
        myNewCar.gearNeutral(true);
        myNewCar.gearDrive(true);
        myNewCar.increaseSpeed(60);
        myNewCar.decreaseSpeed(120);
        myNewCar.gearPark(true);
        myNewCar.isCarTurnOn(false);


    }
}
