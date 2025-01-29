public class Pow {
    double power(double b, int e) {
        return Math.pow(b, e);
    }

    public static void main(String[] args) {
        Pow pow = new Pow();
        System.out.println(pow.power(2.0, 3));
    }
}
