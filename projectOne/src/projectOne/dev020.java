package projectOne;
import java.util.Scanner;
public class dev020 
{
	public static Scanner leia = new Scanner(System.in);
	public static void main(String[] args)
	{
		float numero;
		
		System.out.print("Digite um numero inteiro: ");
		numero = leia.nextFloat();
		
		if (numero % 2 == 0)
		{
			System.out.print("0 numero "+numero+" é PAR");
		}
		else
			System.out.print("O numero "+numero+" é IMPAR");

	}

}
