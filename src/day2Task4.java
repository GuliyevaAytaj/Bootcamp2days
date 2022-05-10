import java.util.Scanner;

public class day2Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number");
        int a = sc.nextInt();



        if ((a>0)){
            if (a % 2 == 0){
                System.out.println("false");
            }
            else {
                System.out.println("true");
            }
        }
        else {
            System.out.println("Please enter number more than 0");
        }


    }
}