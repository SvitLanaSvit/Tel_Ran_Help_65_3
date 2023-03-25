package task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature1: ");
        float temperature1 = scanner.nextFloat();
        System.out.print("Enter temperature2: ");
        float temperature2 = scanner.nextFloat();

        if (temperature1 > 100 && temperature2 < 100)
            System.out.println("true");
        else
            System.out.println("false");
    }
}
