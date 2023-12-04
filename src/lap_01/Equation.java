package lap_01;

import java.util.Arrays;
import java.util.Scanner;

public class Equation {
    public static void main(String[] args) {
        double a, b, c;
        var input = new Scanner(System.in);

        System.out.println("What equations you want to solve ? ");
        System.out.println("1. Solving the first-degree equation (linear equation) with one variable ");
        System.out.println("1. Solving the first-degree equation (linear system) with two variables ");
        System.out.println("1. Solving the second-degree equation with one variable ");
        System.out.println("Your option [1, 2, 3]: ");
        var num = input.nextInt();
        switch (num) {
            case 1:
                System.out.print("Enter a: ");
                a = input.nextDouble();

                System.out.print("Enter b: ");
                b = input.nextDouble();

                if (a != 0) {
                    double solution = -b / a;
                    System.out.printf("The solution is: %f", solution);
                } else if (b == 0) {
                    System.out.println("The solution is all x! ");
                } else {
                    System.out.println("No solution!");
                }
                break;
            case 2: //Use Cramer equation
                /* we solve the linear system
                a_11 * x1 + a_12 * x2 = b_1
                a_21 * x1 + a_22 * x2 = b_2
                 */
                // input : equation
                System.out.print("Enter a11: ");
                double a11 = input.nextDouble();
                System.out.print("Enter a12:");
                double a12 = input.nextDouble();
                System.out.print("Enter b1:");
                double b1 = input.nextDouble();

                System.out.print("Enter a21: ");
                double a21 = input.nextDouble();
                System.out.print("Enter a22:");
                double a22 = input.nextDouble();
                System.out.print("Enter b2:");
                double b2 = input.nextDouble();

                double determinant = a11 * a22 - a12 * a21;
                if (determinant != 0) {
                    double x1 = (b1 * a22 - a12 * b2) / determinant;
                    double x2 = (b2 * a11 - a21 * b1) / determinant;
                    System.out.printf("The solution is: x1 = %f, x2 = %f\n", x1, x2);
                } else {
                    double dx = b1 * a22 - b2 * a12;
                    if (dx == 0) {
                        System.out.println("Many solution !");
                    } else {
                        System.out.println("No solution!");
                    }
                }
                break;
            case 3:
                System.out.print(" Enter a: ");
                a = input.nextDouble();
                System.out.print(" Enter b: ");
                b = input.nextDouble();
                System.out.print(" Enter c: ");
                c = input.nextDouble();

                if (a == 0) System.out.printf("The solution is: x = %f", -c / b);
                else {
                    double delta = b * b - 4 * a * c;

                    if (delta > 0) {
                        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                        double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                        System.out.printf("The solution is: x1 = %f, x2 = %f\n", x1, x2);
                    } else if (delta == 0) {
                        double x1 = -b / 2 * a;
                        System.out.printf("The solution is x1 = x2 = %f\n", x1);
                    } else {
                        System.out.println("No solution! ");
                    }
                }
                break;

        }
    }
}