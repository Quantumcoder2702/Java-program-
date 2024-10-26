public class Fractionj
 {
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
        this.num = num;
        this.denom = denom;
    }

    public Fraction(Fraction f) {
        this.num = f.num;
        this.denom = f.denom;
    }

    public void show() {
        if (denom == 1) {
            System.out.println(num);
        } else {
            System.out.println(num + "/" + denom);
        }
    }

    public Fraction add(Fraction f) {
        int newNum = this.num * f.denom + f.num * this.denom;
        int newDenom = this.denom * f.denom;
        Fraction result = new Fraction(newNum, newDenom);
        result.reduce();
        return result;
    }

    public Fraction subtract(Fraction f) {
        int newNum = this.num * f.denom - f.num * this.denom;
        int newDenom = this.denom * f.denom;
        Fraction result = new Fraction(newNum, newDenom);
        result.reduce();
        return result;
    }

    public Fraction multiply(Fraction f) {
        int newNum = this.num * f.num;
        int newDenom = this.denom * f.denom;
        Fraction result = new Fraction(newNum, newDenom);
        result.reduce();
        return result;
    }

    public Fraction div(Fraction f) {
        int newNum = this.num * f.denom;
        int newDenom = this.denom * f.num;
        Fraction result = new Fraction(newNum, newDenom);
        result.reduce();
        return result;
    }

    public int compare(Fraction f) {
        int newNum1 = this.num * f.denom;
        int newNum2 = f.num * this.denom;
        if (newNum1 > newNum2) {
            return 1;
        } else if (newNum1 < newNum2) {
            return -1;
        } else {
            return 0;
        }
    }

    public void mixed() {
        if (num > denom) {
            int whole = num / denom;
            int remainder = num % denom;
            System.out.println(whole + " " + remainder + "/" + denom);
        } else {
            System.out.println(num + "/" + denom);
        }
    }

    public void reduce() {
        int gcd = gcd(num, denom);
        num /= gcd;
        denom /= gcd;
    }

    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    public static void main(String[] args) {
        Fraction f1 = new Fraction();
        Fraction f2 = new Fraction(5);
        Fraction f3 = new Fraction(3, 4);
        Fraction f4 = new Fraction(f3);

        System.out.println("f1:");
        f1.show();

        System.out.println("f2:");
        f2.show();

        System.out.println("f3:");
        f3.show();

        System.out.println("f4:");
        f4.show();

        Fraction f5 = f2.add(f3);
        System.out.println("f2 + f3:");
        f5.show();
        f5.mixed();

        Fraction f6 = f2.subtract(f3);
        System.out.println("f2 - f3:");
        f6.show();
        f6.mixed();

        Fraction f7 = f2.multiply(f3);
        System.out.println("f2 * f3:");
        f7.show();
        f7.mixed();

        Fraction f8 = f2.div(f3);
        System.out.println("f2 / f3:");
        f8.show();
        f8.mixed();

        System.out.println("Compare f2 and f3:");
        System.out.println(f2.compare(f3));
    }
}