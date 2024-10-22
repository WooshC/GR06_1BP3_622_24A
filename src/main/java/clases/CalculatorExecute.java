package clases;

public class CalculatorExecute {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        if (args.length == 0) {
            System.out.println("No se proporcionaron argumentos. Se requieren operación y números.");
            return;
        }

        // Suponiendo que args[0] es la operación y los siguientes son los números
        int operationChoice = Integer.parseInt(args[0]);
        int firstNumber = Integer.parseInt(args[1]);
        int secondNumber = Integer.parseInt(args[2]);
        calculator.execute(operationChoice, firstNumber, secondNumber);
    }
}
