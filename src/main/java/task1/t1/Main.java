package task1.t1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter temperature Celsius: ");
        double tempC = scanner.nextDouble();
        Convert convert = new Convert(tempC);
        System.out.println("The temperature " + tempC + " C = " + convert.getTemperatureKelvin() + " K");
        System.out.println("The temperature " + tempC + " C = " + convert.getTemperatureFahrenheit() + " F");
    }
}
