package day3Task5;

public class car extends vehicle {
    private boolean isLeftDirection;
    private boolean isRightDirection;
    private boolean isGearP;
    private boolean isGearR;
    private boolean isGearN;
    private boolean isGearD;
    private String typeOfFuel;
    private String typeOfTransmission;
    private int numberOfSeats;
    private int maxSpeed;
    private int minSpeed;
    private int speed = 0;
    private int amount;
    private boolean isCarTurnOn;

    public car(String typeOfFuel, String typeOfTransmission, int numberOfSeats, int minSpeed, int maxSpeed) {

        this.typeOfFuel = typeOfFuel;
        this.typeOfTransmission = typeOfTransmission;
        this.numberOfSeats = numberOfSeats;
        this.maxSpeed = maxSpeed;
        this.minSpeed = minSpeed;

    }

    public car() {

    }

    public int getMinSpeed() {
        return minSpeed;
    }

    public void setMinSpeed(int minSpeed) {
        this.minSpeed = minSpeed;
        System.out.println("Your car`s minimum speed is " + minSpeed);
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
        System.out.println("Your car`s maximum speed is " + maxSpeed);
    }

    public String getTypeOfFuel() {
        return typeOfFuel;
    }

    public void setTypeOfFuel(String typeOfFuel) {
        this.typeOfFuel = typeOfFuel;
        System.out.println("The type of car`s fuel is " + typeOfFuel);
    }

    public String getTypeOfTransmission() {
        return typeOfTransmission;
    }

    public void setTypeOfTransmission(String typeOfTransmission) {
        this.typeOfTransmission = typeOfTransmission;
        System.out.println("The type of car`s trnasmission is " + typeOfTransmission);
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
        System.out.println("The number of seats in a car is " + numberOfSeats);
    }

    public boolean isCarTurnOn(boolean isCarTurnOn) {
        this.isCarTurnOn = isCarTurnOn;
        if (isCarTurnOn == true) {
            System.out.println("Your car is turned on");
        } else {
            System.out.println("Your car is turned off");
        }
        return isCarTurnOn;
    }

    public boolean driveLeft(boolean isLeftDirection) {
        System.out.println("Car turned to the left");
        return isLeftDirection;
    }

    public boolean driveRight(boolean isRightDirection) {
        System.out.println("Car turned to the right");
        return isRightDirection;
    }

    public boolean gearPark(boolean isGearP) {
        System.out.println("Car`s gear in P");
        return isGearP;
    }

    public void gearReverse(boolean isGearR) {
        System.out.println("Car`s gear in R");
    }

    public boolean gearNeutral(boolean isGearN) {
        System.out.println("Car`s gear in N");
        return isGearN;
    }

    public boolean gearDrive(boolean isGearD) {
        System.out.println("Car`s gear in D");
        return isGearD;
    }

    public void getSpeed(int speed) {
        System.out.println("Current speed of car is " + speed);

    }

    public void setSpeed(int speed) {
        this.speed = speed;
        if (speed == 0) {
            System.out.println("Car is not moving");
        }
    }

    public void increaseSpeed(int amount) {
        if (amount < speed) {
            speed = 0;
            System.out.println("Car already reached minimum speed and stopped");
        } else if (amount > maxSpeed) {
            speed = maxSpeed;
            System.out.println("Car already reached maximum speed. Your car is not able to be faster");
        } else {
            speed = amount + speed;
            System.out.println("Your car`s speed increased and became " + speed + " km/h.");
        }

    }

    public void decreaseSpeed(int amount) {
        if (amount < speed) {
            System.out.println("Car already reached minimum speed and stopped");
        } else if (amount > speed) {
            System.out.println("Car already reached maximum speed. Your car is not able to be faster");
        } else {
            speed = amount - speed;
            System.out.println("Your car`s speed decreased and became " + speed + " km/h.");
        }
    }
}
