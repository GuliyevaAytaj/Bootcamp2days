import java.util.Scanner;

public class day2Task2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter two boolean values and compare them:");
        System.out.println("Enter b1 and b2");

         boolean b1 = sc.nextBoolean();
        boolean b2 = sc.nextBoolean();;

        Boolean isb1Equalb2 = null;

            if (b1 == b2) {
                isb1Equalb2 = true;
            }
            else if ((b1 != b2)){
                isb1Equalb2 = false;
            }
            System.out.println("Is " + b1 + " and " + b2 + " equal? - " + isb1Equalb2);


}
}