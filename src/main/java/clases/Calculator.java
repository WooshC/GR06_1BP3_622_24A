package clases;

import java.util.Scanner;

public class Calculator {
    private Scanner scanner;

    public Calculator() {
        scanner = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            System.out.println("Seleccione una operación:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");

            int operationChoice = scanner.nextInt();
            if (operationChoice == 5) {
                System.out.println("Saliendo...");
                break;
            }

            System.out.print("Ingrese el primer número: ");
            int firstNumber = scanner.nextInt();
            System.out.print("Ingrese el segundo número: ");
            int secondNumber = scanner.nextInt();

            switch (operationChoice) {
                case 1:
                    System.out.println("Resultado: " + add(firstNumber, secondNumber));
                    break;
                case 2:
                    System.out.println("Resultado: " + subtract(firstNumber, secondNumber));
                    break;
                case 3:
                    System.out.println("Resultado: " + multiply(firstNumber, secondNumber));
                    break;
                case 4:
                    if (secondNumber != 0) {
                        System.out.println("Resultado: " + divide(firstNumber, secondNumber));
                    } else {
                        System.out.println("Error: División por cero no permitida.");
                    }
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
        scanner.close();
    }

    public int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int subtract(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public double divide(int firstNumber, int secondNumber) {
        if (secondNumber == 0) {
            throw new ArithmeticException("División por cero no permitida.");
        }
        return (double) firstNumber / secondNumber;
    }



}
