package projectOne;
import java.util.Scanner;
public class dev045 
{
	public static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int contador = 0, numero;
		
		System.out.print("Digite um valor inteiro positivo: ");
		numero = leia.nextInt();
		
		do
		{
			contador = contador + 1;
			System.out.print(""+contador+" ");
		}
		while(contador < numero);
		System.out.println("\nACABOU!");
		

	}

}
