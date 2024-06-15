public class nm2 {
    public static void main(String[] args) {
        int number = 24;
        System.out.println(findSmallestDivider(number));
    }

    public static int findSmallestDivider(int number) {
        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                return i;
            }
        }
        return number;
    }
}