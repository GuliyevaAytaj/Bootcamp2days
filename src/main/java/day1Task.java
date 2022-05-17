

public class day1Task {
    public static void main(String args[])  {
        byte byteType = 3;
        char charType = 3434;
        short shortType = -156;
        int intType = 223821;
        long longType = -4535;
        float floatType = 0.7f;
        double doubleType = 54.7;
        boolean isBooleanType = true;

        System.out.println(byteType + " " + ((Object)byteType).getClass().getName());
        System.out.println(byteType + " " + ((Object)charType).getClass().getName());
        System.out.println(byteType + " " + ((Object)shortType).getClass().getName());
        System.out.println(byteType + " " + ((Object)intType).getClass().getName());
        System.out.println(byteType + " " + ((Object)longType).getClass().getName());
        System.out.println(byteType + " " + ((Object)floatType).getClass().getName());
        System.out.println(byteType + " " + ((Object)doubleType).getClass().getName());
        System.out.println(byteType + " " + ((Object)isBooleanType).getClass().getName());

    }
}
