package projectOne;
import java.util.Scanner;
public class dev024 
{
	public static Scanner leia = new Scanner(System.in);
	 public static void main(String[] args) 
	 {
		 double numero1,numero2;
		 double resultado=0;
		 String operacao;
		 
		 System.out.printf("Digite o Primeiro número: ");
		 numero1 = leia.nextDouble();
		 
		 System.out.printf("Digite a Operação [+,-,* ou /]: ");
		 operacao = leia.next();
		 
		 System.out.printf("Digite o Segundo número: ");
		 numero2 = leia.nextDouble();
		 
		 switch(operacao)
		 {
		 case "+":
			  resultado=numero1+numero2;
		 break; 
		 case "-":
			  resultado=numero1-numero2;
		 break;
		 case "*":
			  resultado=numero1*numero2;
		 break;
		 case "/":
			  resultado=numero1/numero2;
		 break; 
		 default:
			  System.out.printf("Operação errada!"); 
		 }
		 if (operacao.equals("+") || operacao.equals("-") ||  operacao.equals("*") || operacao.equals("/"))
		 {
			 System.out.printf("Resultado da operação %s é:  %9.2f",operacao,resultado);
		 }
	}

}
