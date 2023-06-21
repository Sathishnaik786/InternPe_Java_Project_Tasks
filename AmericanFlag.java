public class AmericanFlag {
    public static void main(String[] args) {
        int rows = 13;
        int cols = 21;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i < 9) {
                    if (j < 9 && (i + j) % 2 == 0) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    System.out.print("=");
                }
            }
            System.out.println();
        }
    }
}

