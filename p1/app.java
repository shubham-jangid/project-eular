class App {
    public static void main(String args[]) {
        int sum = 0;

        for (int l = 1; l < 1000; l++) {

            if (l % 3 == 0 || l % 5 == 0) {
                sum = sum + l;
            }

        }

        System.out.printf(" %n" + sum);

    }
}