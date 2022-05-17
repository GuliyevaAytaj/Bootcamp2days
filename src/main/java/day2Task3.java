import java.util.Scanner;

public class day2Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number");
        try {
            int a = sc.nextInt();
            if (a>0){
                System.out.println(a%2==0);
            }
            else {
                System.out.println("Please enter only numbers which are more than 0");
            }
        } catch (Exception e){
            System.out.println("Please enter only numbers");
        }
        }
    }