import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();

        
        System.out.print("Ingrese el operador (+, -, *, /): ");
        char operador = scanner.next().charAt(0);

        
        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();

        // Variable para almacenar el resultado
        double resultado = 0;

   
        switch (operador){
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                resultado= num1 / num2;
                break;
        
        }
        System.out.println("resultado: " + resultado);

        scanner.close();


    }

}


