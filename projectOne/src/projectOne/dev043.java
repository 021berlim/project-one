package projectOne;
import java.util.Scanner;
public class dev043 
{
	public static Scanner leia = new Scanner(System.in);
	public static void main(String[] args)
	{
		int contador = 0;
		do
		{
			contador = contador + 3;
			System.out.print(""+contador+" ");
		}
		while(contador < 18);
		System.out.println("\nACABOU!");
	}

}
