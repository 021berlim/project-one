package projectOne;
//import java.util.Scanner;
public class dev047 
{
//	public static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int x = 99;
		System.out.print("Exibindo os numeros pares e impares de 100 a 200 \n");
		
		do
		{
			x = x + 1;
			
			if(x%2 == 1)
			{
				System.out.print(""+x+", ");
			}
			if(x%2 == 0)
			{
				System.out.print("["+x+"], ");
			}
		}
		while(x <= 199);
	}

}
