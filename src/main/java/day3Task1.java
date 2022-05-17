public class day3Task1 {
    public static void main(String[] args) {

        int[][] multiplicationArr = new int[10][10];
        int j;
        int i;

        for (i = 1; i < 10; i++){
            for (j = 1; j < 10; j++) {
                multiplicationArr[i][j] = (j+1)*(i+1);
                System.out.println(i + " * " + j + " = " + multiplicationArr[i][j] + "\t");
            }
            System.out.println();
    }}
}
