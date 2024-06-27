package projectOne;
import java.util.Scanner;
public class dev044 
{
	public static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int contador = 105;
		do
		{
			contador = contador - 5;
			System.out.print(""+contador+" ");
		}
		while(contador > 0);
		System.out.println("\nACABOU!");
	}

}
