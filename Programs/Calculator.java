package Programs;

import java.util.Scanner;

class Calculator1 {
    double a, b;
    String operation;

    // Constructor
    Calculator1(double a, double b, String operation) {
        this.a = a;
        this.b = b;
        this.operation = operation;
    }

    public double calculate() {
        switch (operation.toLowerCase()) {
            case "add":
                return a + b;
            case "sub":
                return a - b;
            case "mul":
                return a * b;
            case "div":
                if (b != 0) {
                    return a / b;
                } else {
                    System.out.println("Error: Division by zero!");
                    return 0;
                }
            default:
                System.out.println("Invalid operation");
                return 0;
        }
    }
}

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = sc.nextDouble();

        System.out.print("Enter b: ");
        double b = sc.nextDouble();

        System.out.print("Enter operation (add, sub, mul, div): ");
        String op = sc.next();

        Calculator1 calc = new Calculator1(a,b,op);
        System.out.println("Result = " + calc.calculate());

        sc.close();
    }
}
