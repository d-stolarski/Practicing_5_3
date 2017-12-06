public class Zad03 {
    public static void main(String[] args) {

        double i = 0;
        double j = 0;

        while(i < 3.1) {
            System.out.printf("%.1f , ", i);
            i += 0.1;
        }

        System.out.println();

        do {
            System.out.printf("%.1f , ", j);
            j += 0.1;
        } while (j < 3.1);
    }
}
