public class nm4 {
    public static void main(String[] args) {
        int number = 5;
        System.out.println(factorial(number));
    }

    public static int factorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
