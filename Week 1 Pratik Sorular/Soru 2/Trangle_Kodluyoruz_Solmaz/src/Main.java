public class Main {

    static void rightTriangle() {
        int i, j, row = 5;
        for (i = 0; i < row; i++) {
            for (j = 0; j <= i; j++) {

                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }

    static void leftTriangle() {
        int i, j, row = 5;
        for (i = 0; i < row; i++) {
            for (j = 2 * (row - i); j >= 0; j--) {
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    static void doubleTriangle() {
        int i, j, temp = 0, s = 20, row = 5;
        for (i = 0; i < row; i++) {
            for (j = 0; j <= i; j++) {
                System.out.print("* ");

                s = 20 - (4 * temp);
                temp++;
            }
            while (s > 0) {
                System.out.print("\s");
                s--;
            }
            int temp2 = temp;

            while (temp > 0) {
                System.out.print("* ");
                temp--;
            }

            System.out.println("");
        }

    }

    public static void main(String[] args) {
        rightTriangle();
        System.out.println("");
        doubleTriangle();
        System.out.println("");
        leftTriangle();


    }


}