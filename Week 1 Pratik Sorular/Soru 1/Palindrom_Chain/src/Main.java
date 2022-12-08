public class Main {
    static int number, reverse, sumReverse, remain;


    public static int sumReverser(int number) {
        int tempnumber = number;
        while (number > 0) {
            remain = number % 10;
            reverse = (reverse * 10) + remain;
            number = number / 10;
        }
        reverse = tempnumber + reverse;
        return reverse;
    }

    public static int reverser(int reverse) {
        while (number > 0) {
            remain = number % 10;
            reverse = (reverse * 10) + remain;
            number = number / 10;
        }

        return reverse;
    }

    public static boolean checker(int m, int n) {
        return m == n;
    }

    public static int palindromChecker(int i) {
        // Bu methodda bir sıkıntı var ancak çözemedim döngüye sadece 1 sefer giriyor. O yüzden count hep 1 oluyor.
        int count = 0;
        boolean check = false;
        while (check == false) {
            reverse = sumReverser(i);
            sumReverse = reverser(reverse);
            count++;
            check = checker(reverse, sumReverse);
        }
        System.out.println(count);
        return count;
    }

    public static void printer() {
        int[] counterArray = new int[91];

        int j = 0;
        for (int i = 10; i < 100; i++) {
            counterArray[j] = palindromChecker(i);
            j++;
        }

        int tempcount = 10;
        int peeknumber = 0;
        int peek = counterArray[0];
        System.out.println(counterArray[65]);

        for (int p = 0; p > counterArray.length; p++) {

            if (counterArray[p] > peek) {
                peek = counterArray[p];
                peeknumber = tempcount;
            }
            tempcount++;
        }
        System.out.println("En çok tekrarlayan sayı: " + peeknumber + "   Tekrarlama sayısı: " + peek);

    }

    public static void main(String[] args) {
        printer();
    }

}

