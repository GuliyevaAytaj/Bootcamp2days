import java.util.Scanner;

public class day2task6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter 2 numbers a and b");
        int a = sc.nextInt();
        int b = sc.nextInt();


        if ((a==b) || (a<0) || ((a>100)&&(b>100)) ) {
            System.out.println( "a is "+ a + " and b is " + b + " -> true");
        }
        else {
            System.out.println( "a is "+ a + " and b is " + b + " -> false");
        }
    }

}

