public class Exercise_1804 {

    public static void main(String[] args) {

        for (int i = 1; i < 10; i++) {
            System.out.println(m(i));
        }

    }

    public static double m(int i) {
        if (i <= 0) return 0;
        if (i == 1)
            return 1;
        else
            return m(i - 1) + 1.0 / i;

    }
}