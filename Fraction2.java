import java.util.Scanner;

class Fraction2 {
    private int num;
    private int denom;

    public Fraction() {
        this.num = 0;
        this.denom = 1;
    }

    public Fraction(int num) {
        this.num = num;
        this.denom = 1;
    }

    public Fraction(int num, int denom) {
        if (denom == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero.");
        }
        this.num = num;
        this.denom = denom;
        reduce();
    }

    public Fraction(Fraction other) {
        this.num = other.num;
        this.denom = other.denom;
    }

    public void show() {
        if (denom == 1) {
            System.out.println(num);
        } else {
            System.out.println(num + "/" + denom);
        }
    }

    public Fraction add(Fraction other) {
        int newNum = this.num * other.denom + other.num * this.denom;
        int newDenom = this.denom * other.denom;
        return new Fraction(newNum, newDenom);
    }

    public Fraction subtract(Fraction other) {
        int newNum = this.num * other.denom - other.num * this.denom;
        int newDenom = this.denom * other.denom;
        return new Fraction(newNum, newDenom);
    }

    public Fraction multiply(Fraction other) {
        int newNum = this.num * other.num;
        int newDenom = this.denom * other.denom;
        return new Fraction(newNum, newDenom);
    }

    public Fraction divide(Fraction other) {
        if (other.num == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        int newNum = this.num * other.denom;
        int newDenom = this.denom * other.num;
        return new Fraction(newNum, newDenom);
    }

    public int compare(Fraction other) {
        int thisNumerator = this.num * other.denom;
        int otherNumerator = other.num * this.denom;
        return Integer.compare(thisNumerator, otherNumerator);
    }

    private void reduce() {
        int gcd = gcd(Math.abs(num), Math.abs(denom));
        this.num /= gcd;
        this.denom /= gcd;
        if (denom < 0) {
            this.num = -this.num;
            this.denom = -this.denom;
        }
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public void mixed() {
        if (num >= denom) {
            int wholePart = num / denom;
            int remainder = num % denom;
            if (remainder != 0) {
                System.out.println(wholePart + " " + remainder + "/" + denom);
            } else {
                System.out.println(wholePart);
            }
        } else {
            show();
        }
    }
}

public class FractionTest {
    public static void main(String[] args) {
        Fraction f1 = new Fraction();
        Fraction f2 = new Fraction(5);
        Fraction f3 = new Fraction(3, 4);
        Fraction f4 = new Fraction(1, 2);
        Fraction f5 = new Fraction(f3);

        System.out.println("Fraction f1:");
        f1.mixed();
        System.out.println("Fraction f2:");
        f2.mixed();
        System.out.println("Fraction f3:");
        f3.mixed();
        System.out.println("Fraction f4:");
        f4.mixed();
        System.out.println("Fraction f5 (copy of f3):");
        f5.mixed();

        Fraction sum = f3.add(f4);
        System.out.print("f3 + f4 = ");
        sum.mixed();

        Fraction difference = f3.subtract(f4);
        System.out.print("f3 - f4 = ");
        difference.mixed();

        Fraction product = f3.multiply(f4);
        System.out.print("f3 * f4 = ");
        product.mixed();

        Fraction quotient = f3.divide(f4);
        System.out.print("f3 / f4 = ");
        quotient.mixed();

        int comparison = f3.compare(f4);
        if (comparison > 0) {
            System.out.println("f3 is greater than f4");
        } else if (comparison < 0) {
            System.out.println("f3 is less than f4");
        } else {
            System.out.println("f3 is equal to f4");
        }
    }
}
