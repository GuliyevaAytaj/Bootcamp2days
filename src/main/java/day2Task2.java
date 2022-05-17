import java.util.Scanner;

public class day2Task2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter two boolean values and compare them:");
        System.out.println("Enter b1 and b2");
        try {
            boolean b1 = sc.nextBoolean();
            boolean b2 = sc.nextBoolean();
            System.out.println("Is " + b1 + " and " + b2 + " equal? - " + (b1==b2));
        } catch (Exception e){
            System.out.println("Please enter only true or false");
        }

}
}