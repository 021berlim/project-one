package projectOne;
import java.util.Scanner;
public class dev011 
{
	public static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) 
	{
		float a,b,c,delta;
		
		System.out.println("Informe os valores solicitados abaixo:");
		System.out.print("A:");
		a = leia.nextFloat();
		System.out.print("B:");
		b = leia.nextFloat();
		System.out.print("C:");
		c = leia.nextFloat();
		
		delta = b*b-(4*a*c);
		
		System.out.print("O valor do delta é "+delta+"");
		
	}

}
