import java.util.Scanner;

public class day2Task {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter two numbers, compare them and output result:");


        try {
            int firstNumber = sc.nextInt();
            int secondNumber = sc.nextInt();
            System.out.println("is " + firstNumber + "equal to " + secondNumber + "? - " + (firstNumber == secondNumber) + "\n" +
                    "is " + firstNumber + "less than " + secondNumber + "? - " + (firstNumber<secondNumber) + "\n" +
                    "is " + firstNumber + "less or equal to " + secondNumber + "? - " + (firstNumber<=secondNumber) + "\n" +
                    "is " + firstNumber + "greater than " + secondNumber + "? - " + (firstNumber>secondNumber) + "\n" +
                    "is " + firstNumber + "greater or equal to " + secondNumber + "? - " + (firstNumber>=secondNumber) + "\n");
        } catch (Exception e){
            System.out.println("Please enter only numbers");
        }


}}