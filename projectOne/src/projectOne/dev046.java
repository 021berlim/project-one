package projectOne;
import java.util.Scanner;
public class dev046 
{
	public static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int contador = 0, numero, x;
		
		System.out.print("Digite um numero inteiro: ");
		numero = leia.nextInt();
		
		do
		{
			contador = contador + 1;
			x = numero*contador;
			System.out.print(""+numero+"x"+contador+"="+x+"\n");
		}
		while(contador < 10);
		System.out.println("\nACABOU!");
	}

}
