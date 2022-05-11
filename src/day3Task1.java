public class day3Task1 {
    public static void main(String[] args) {

        int raw[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int column[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

        for (int i = column[0]; i <= column[10]; ++i) {
            for (int b = raw[0]; b <= raw[10]; ++b) {
                System.out.println(b + "*" + i + " = " + (b * i));
            }

        }

    }

}
