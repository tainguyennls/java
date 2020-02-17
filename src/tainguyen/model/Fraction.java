package tainguyen.model;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction() {
    }

    public Fraction(int numerator, int denominator) {
        try {
            requireNotZero(denominator);
        } catch (Exception e) {
            e.printStackTrace();
        }

        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        try {
            requireNotZero(denominator);
        } catch (Exception e) {
            e.printStackTrace();
        }

        this.denominator = denominator;
    }

    public void requireNotZero(int number) throws Exception {
        if (number == 0) {
            throw new Exception("Denominator must be different zero value");
        }
    }

    @Override
    public String toString() {
        return "Fraction(" + "numerator = " + numerator + "; denominator = " + denominator + ')';
    }

    /**
     *
     * @param other
     * @return Fraction
     */
    public Fraction sum(Fraction other) {
        Fraction sum = new Fraction();
        sum.setNumerator(this.numerator * other.getDenominator() + other.getNumerator() * this.denominator);
        sum.setDenominator(this.denominator * other.getDenominator());

        return sum;
    }

    /**
     *
     * @param other
     * @return Fraction
     */
    public Fraction subtract(Fraction other) {
        Fraction sum = new Fraction();
        sum.setNumerator(this.numerator * other.getDenominator() - other.getNumerator() * this.denominator);
        sum.setDenominator(this.denominator * other.getDenominator());

        return sum;
    }

    /**
     *
     * @param other
     * @return Fraction
     */
    public Fraction multiply(Fraction other) {
        Fraction sum = new Fraction();
        sum.setNumerator(this.numerator * other.getNumerator());
        sum.setDenominator(this.denominator * other.getDenominator());

        return sum;
    }

    /**
     *
     * @param other
     * @return Fraction
     */
    public Fraction divide(Fraction other) {
        Fraction sum = new Fraction();
        sum.setNumerator(this.numerator * other.getDenominator());
        sum.setDenominator(this.denominator * other.getNumerator());

        return sum;
    }
}
