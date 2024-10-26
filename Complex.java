class Complex {
    private int real;
    private int imag;

    public Complex() {
        this.real = 0;
        this.imag = 0;
    }

    public Complex(int real, int imag) {
        this.real = real;
        this.imag = imag;
    }

    public Complex(Complex other) {
        this.real = other.real;
        this.imag = other.imag;
    }

    // Method to display the complex number
    public void showComplex() {
        if (imag >= 0) {
            System.out.println(real + " + " + imag + "i");
        } else {
            System.out.println(real + " - " + (-imag) + "i");
        }
    }

    public Complex addComplex(Complex other) {
        int newReal = this.real + other.real;
        int newImag = this.imag + other.imag;
        return new Complex(newReal, newImag);
    }

    public Complex subtractComplex(Complex other) {
        int newReal = this.real - other.real;
        int newImag = this.imag - other.imag;
        return new Complex(newReal, newImag);
    }

    public Complex multiplyComplex(Complex other) {
        int newReal = this.real * other.real - this.imag * other.imag;
        int newImag = this.real * other.imag + this.imag * other.real;
        return new Complex(newReal, newImag);
    }
}

public class ComplexTest {
    public static void main(String[] args) {
        Complex c1 = new Complex();
        Complex c2 = new Complex(4, 5);
        Complex c3 = new Complex(2, -3);
        Complex c4 = new Complex(c2);

        System.out.print("c1: ");
        c1.showComplex();
        System.out.print("c2: ");
        c2.showComplex();
        System.out.print("c3: ");
        c3.showComplex();
        System.out.print("c4 (copy of c2): ");
        c4.showComplex();

        Complex sum = c2.addComplex(c3);
        System.out.print("c2 + c3 = ");
        sum.showComplex();

        Complex difference = c2.subtractComplex(c3);
        System.out.print("c2 - c3 = ");
        difference.showComplex();

        Complex product = c2.multiplyComplex(c3);
        System.out.print("c2 * c3 = ");
        product.showComplex();
    }
}
