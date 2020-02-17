package tainguyen.test.java;

import tainguyen.model.Fraction;

public class FractionTest {

    public static void main(String[] args) {
        Fraction first = new Fraction();

        first.setNumerator(1);
        first.setDenominator(2);

        Fraction second = new Fraction(2,3);

        // Expected: (7, 6)
        System.out.println("Sum " + first.sum(second));

        // Expected: (-1, 6)
        System.out.println("Subtract " + first.subtract(second));

        // Expected: (2, 6)
        System.out.println("Multiply " + first.multiply(second));

        // Expected: (3, 4)
        System.out.println("Divide " + first.divide(second));
    }
}
