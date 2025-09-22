/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab_4;

import java.lang.ArithmeticException;
import java.lang.Math;
import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Lab_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Java Loop Laboratory Activity 4 \n\nof \n\nMarcelo Jr L. Depalubos\n\nPlease input a number to start.\n");
        int choice;

        do {
            System.out.println("1. Activity I");
            System.out.println("2. Activity II");
            System.out.println("3. Activity III");
            System.out.println("4. Activity IV");
            System.out.println("5. Activity V");
            System.out.println("6. Close");
            System.out.println("\nPlease input a number to choose an activity.");
            choice = input.nextInt();

            switch (choice) {
                case 1: {
                    System.out.println("\nPlease enter an Integer.\n");
                    int Integer = input.nextInt();
                    for (int i = 1; i <= 10; i++) {
                        System.out.printf("%d * %d = %d \n", Integer, i, Integer * i);
                    }
                    break;
                }
                case 2: {
                    System.out.println("\nPlease enter an Integer(N).");
                    // Assuming 'n' is the target number (e.g., 10 for sum of 1 to 10)
                    int n = input.nextInt();
                    int sum = 0;
                    int i = 1;

                    while (i <= n) {
                        sum += i;
                        i++;
                    System.out.println("N=" + sum);
                    }
                    break;
                }
                case 3: {
                    System.out.println("\nPlease enter an Integer (n).");
                    int n = input.nextInt();
                    int factorial = 1;

                    do {
                        factorial *= n;
                        n--;
                    } while (n >= 1);
                    System.out.println("Factorial: " + factorial);
                }
                break;
                case 4: {
                    System.out.println("\nPlease enter a Number(x).");
                    int number = input.nextInt();

                    System.out.println("Even numbers: ");
                    for (int i = 0; i <= number; i += 2) {
                        System.out.println(i);

                    }
                    System.out.println("For Odd numbers: ");
                    for (int x = 1; x <= number; x += 2) {
                        System.out.println(x);
                    }
                    break;
                }
                case 5: {
                    int Numreversi = 0;
                    System.out.println("\nPlease enter an Integer (z) to reverse. ");
                    int Integer = input.nextInt();

                    System.out.println("Reversed of the Integer: ");
                    for (int i = Integer; i != 0; i /= 10) {
                        int digit = i % 10;
                        Numreversi = Numreversi * 10 + digit;
                    }

                    System.out.println(Numreversi);
                    break;

                }
                case 6: {
                    System.out.println("\nThank You and Good Bye.");
                    System.exit(0);
                }
                default:
                    System.out.println("\nInvalid Choice");
            }

        } while (choice != 0);

        input.close();

    }

}
