package day5;

import day3Task5.car;
import org.junit.Test;
import static org.junit.Assert.*;

public class Test1 {
    car myNewCar = new car();

    @Test
    public void start() {

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
        assertTrue(myNewCar.isCarTurnOn(true));
        myNewCar.setSpeed(0);
        myNewCar.gearDrive(true);
        assertTrue(myNewCar.gearDrive(true));
        myNewCar.increaseSpeed(60);
        myNewCar.driveLeft(true);
        assertTrue(myNewCar.driveLeft(true));
        myNewCar.decreaseSpeed(20);
        myNewCar.driveRight(true);
        assertTrue(myNewCar.driveRight(true));
        myNewCar.gearNeutral(true);
        assertTrue(myNewCar.gearNeutral(true));
        myNewCar.gearDrive(true);
        assertTrue(myNewCar.gearDrive(true));
        myNewCar.increaseSpeed(60);
        myNewCar.decreaseSpeed(120);
        myNewCar.gearPark(true);
        assertTrue(myNewCar.gearPark(true));
        myNewCar.isCarTurnOn(false);
        assertFalse(myNewCar.isCarTurnOn(false));

    }
    }

