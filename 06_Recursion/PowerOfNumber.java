public class PowerOfNumber {

    static int power(int base, int exponent) {

        if (exponent == 0)
            return 1;

        return base * power(base, exponent - 1);
    }

    public static void main(String[] args) {

        int base = 2;
        int exponent = 5;

        System.out.println("Power = " + power(base, exponent));
    }
}