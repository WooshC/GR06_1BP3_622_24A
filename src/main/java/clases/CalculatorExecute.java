package clases;

public class CalculatorExecute {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Si se desea, se puede verificar la operación a ejecutar desde argumentos
        int operationChoice = args.length > 0 ? Integer.parseInt(args[0]) : 1; // Por defecto, operación de suma

        // Definición de los números
        int firstNumber = 5; // Primer número
        int secondNumber = 2; // Segundo número

        // Llamada a la función de ejecución
        calculator.execute(operationChoice, firstNumber, secondNumber);
    }
}

