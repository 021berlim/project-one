package projectOne;
import java.util.Scanner;
public class dev012 
{
	public static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) 
	{
		double valor,valordesconto;
		
		System.out.print("Digite o valor do produto:");
		valor = leia.nextDouble();
		
		valordesconto = valor*1.05;
		System.out.print("O valor do produto com desconto é "+valordesconto+":");

	}

}
