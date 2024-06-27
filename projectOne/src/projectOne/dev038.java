package projectOne;
import java.util.Scanner;
public class dev038 
{
	public static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int numero;
		
		System.out.print("Digite um número:");
		numero = leia.nextInt();
		
		if(numero % 2 == 0)
			System.out.print("Este numero é par");
		else 
			System.out.print("Este numero é impar");

	}

}
