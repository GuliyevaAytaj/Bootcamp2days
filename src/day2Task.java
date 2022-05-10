import java.util.Scanner;

public class day2Task {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter two numbers, compare them and output result:");
        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();

        Boolean is1EqualTo2 = null;
        Boolean is1Less2 = null;
        Boolean is1LessOrEqual2 = null;
        Boolean is1Greater2 = null;
        Boolean is1GreaterOrEqual2 = null;


        if (firstNumber == secondNumber) {
            is1EqualTo2 = true;
        } else if (firstNumber != secondNumber) {
        is1EqualTo2 = false;
        }

        if (firstNumber < secondNumber) {

        is1Less2 = true;
        } else if (firstNumber >= secondNumber) {
       is1Less2 = false;
        }

        if (firstNumber <= secondNumber) {
           is1LessOrEqual2 = true;
        } else if (firstNumber > secondNumber) {
         is1LessOrEqual2 = false;
        }

        if (firstNumber > secondNumber) {
          is1Greater2 = true;
        } else if (firstNumber <= secondNumber) {
          is1Greater2 = false;
        }

        if (firstNumber >= secondNumber) {
         is1GreaterOrEqual2 = true;
        } else if (firstNumber < secondNumber) {
      is1GreaterOrEqual2 = false;
        }

        System.out.println("is " + firstNumber + "equal to " + secondNumber + "? - " + is1EqualTo2 + "\n" +
                "is " + firstNumber + "less than " + secondNumber + "? - " + is1Less2 + "\n" +
                "is " + firstNumber + "less or equal to " + secondNumber + "? - " + is1LessOrEqual2 + "\n" +
                "is " + firstNumber + "greater than " + secondNumber + "? - " + is1Greater2 + "\n" +
                "is " + firstNumber + "greater or equal to " + secondNumber + "? - " + is1GreaterOrEqual2 + "\n");


    }


}