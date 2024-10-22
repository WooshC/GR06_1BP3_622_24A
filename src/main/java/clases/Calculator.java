package clases;

public class Calculator {
    public void execute(int operationChoice, int firstNumber, int secondNumber) {
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
            case 5:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Opción no válida. Intente de nuevo.");
        }
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
