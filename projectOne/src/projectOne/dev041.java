package projectOne;
import java.util.Scanner;
public class dev041
{
	public static Scanner leia = new Scanner(System.in);
	public static void main(String[] args)
	{
		int contador = 5;
		do
		{
			contador = contador + 1;
			System.out.print(""+contador+" ");
			
		}
		while( contador > 5 & contador<=10);
		System.out.println("\nACABOU!");
	}

}
