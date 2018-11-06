class App {
    public static void main(String args[]) {
        int sum = 2;
        int i = 1, j = 2, k = 0;
        System.out.print(" " + i);
        System.out.print(" " + j);

        a: for (int l = 1; l < 4000000; l++) {

            k = i + j;
            i = j;
            j = k;
            // System.out.print(" " + k);
            if (k % 2 == 0) {
                sum = sum + k;
            }
            if (sum >= 4000000) {
                break a;
            }

        }

        System.out.printf(" %n" + sum);

    }
}