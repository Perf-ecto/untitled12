public class nm3{
    public static void main(String[] args) {
        double x1 = 0, y1 = 0;
        double x2 = 1, y2 = 0;
        double x3 = 0, y3 = 1;

        double perimeter = calculateDistance(x1, y1, x2, y2) +
                calculateDistance(x2, y2, x3, y3) +
                calculateDistance(x3, y3, x1, y1);

        System.out.println("Периметр треугольника: " + perimeter);
    }

    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}