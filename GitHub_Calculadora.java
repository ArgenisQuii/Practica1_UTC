import java.util.Scanner;

public class GitHub_Calculadora

{
    public static void main(String[] args) 
    
    {
        Scanner sc = new Scanner(System.in);
        double num1, num2, resultado;
        char operador;

        System.out.println("Calculadora para GitHub");
        System.out.print("Ingrese el primer n�mero: ");
        num1 = sc.nextDouble();

        System.out.print("Ingrese el operador (+, -, *, /): ");
        operador = sc.next().charAt(0);

        System.out.print("Ingrese el segundo n�mero: ");
        num2 = sc.nextDouble();

        switch (operador) 
        { 
            case '*':
                resultado = num1 * num2;
                System.out.println("Resultado: " + resultado);
                break;

            case '+':
                resultado = num1 + num2;
                System.out.println("Resultado: " + resultado);
                break;
                
            case '-':
	                resultado = num1 - num2;
	                System.out.println("Resultado: " + resultado);
	                break;

            case '/':
            	
                if (num2 != 0)
                {
                    resultado = num1 / num2;
                    System.out.println("Resultado: " + resultado);
                } 
                
                else 
                {
                    System.out.println("No se puede dividir por cero.");
                }
                break;
            default:
                System.out.println("Operador no v�lido.");
        }
    }

}
