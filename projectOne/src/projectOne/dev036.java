package projectOne;
import java.util.Scanner;
public class dev036
{
	public static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) 
	{
		double a,b,c;
		
		System.out.print("Informe os valores solicitados abaixo:");
		System.out.print("Valor A:");
		a = leia.nextDouble();
		System.out.print("Valor B:");
		b = leia.nextDouble();
		System.out.print("Valor C:");
		c = leia.nextDouble();
		
		if(a + b < c)
		{
			System.out.print("A soma de "+a+" e "+b+" � menor que "+c+"");
		}
		else
			System.out.print("A soma de "+a+" e "+b+" � maior que "+c+"");

	}

}
