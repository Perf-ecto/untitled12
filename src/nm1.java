public class nm1 {
    public static void main(String[] args) {
        int year = 2020;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}