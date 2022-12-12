package ie.atu.week12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
            System.out.println("Please enter students' first name: ");
            Scanner input = new Scanner(System.in);
            String name1 = input.nextDouble();
            System.out.println("You entered: " + name1);

            System.out.println("Please enter students' ID number: ");
            double num1 = input.nextDouble();
            System.out.println("You entered: " + num1);

            System.out.println("Please enter students' age: ");
            double num2 = input.nextDouble();
            System.out.println("You entered: " + num2);

            System.out.println("Please enter students' address: ");
            String name2 = input.nextDouble();
            System.out.println("You entered: " + name2);
    }
}
