package projectOne;
import java.util.Scanner;
public class dev049 
{
	public static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) 
	{
		double a, b, resultado;
		String operador;
	
		System.out.print("Digite uma das opera��es a seguir:\n"
				+ "\t+ Adi��o"
				+ "\t- Subtra��o"
				+ "\t* Multiplica��o"
				+ "\t/ Divis�o\n");
		operador = leia.next();
		
//		System.out.print("Informe os numeros abaixo:\n");
		
		System.out.print("Primeiro Numero:");
		a = leia.nextDouble();
		
		System.out.print("Segundo Numero:");
		b = leia.nextDouble();
		
		switch(operador)
		{
			case "+":
				resultado = a+b;
				System.out.print("Resultado de "+a+"+"+b+" = "+resultado+"");
			break;
			case "-":
				resultado = a-b;
				System.out.print("Resultado de "+a+"-"+b+" = "+resultado+"");
			break;
			case "*":
				resultado = a*b;
				System.out.print("Resultado de "+a+"x"+b+" = "+resultado+"");
			break;
			case "/":
				resultado = a/b;
				System.out.print("Resultado de "+a+"/"+b+ " = "+resultado+"");
			break;
			default:
				System.out.print("Operador invalido.");
		}
	}

}
