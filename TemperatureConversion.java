import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double fahrenheit, celsius;

        double[] testValues = {68, 150, 212, 0, -22, -200};

        for (int i = 0; i < testValues.length; i++) {
            fahrenheit = testValues[i];
            celsius = (5.0 / 9.0) * (fahrenheit - 32);
            System.out.println(fahrenheit + "°F is " + celsius + "°C.");
        }

        scanner.close();
    }
}
