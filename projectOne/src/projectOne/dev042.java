package projectOne;
import java.util.Scanner;
public class dev042 
{

	public static Scanner leia = new Scanner(System.in);
	public static void main(String[] args)
	{
		int contador = 11;
		do
		{
			contador = contador -1;
			System.out.print(""+contador+" ");
			
		}
		while(contador >3);
		System.out.println("\nACABOU!");
	}

}
