package projectOne;
import java.util.Scanner;
public class dev028 
{
	public static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) 
	{
		double base, altura, m2;
		
		System.out.print("Informe as informa��es solicitadas abaixo\n");
		
		System.out.print("Largura do terreno:");
		base = leia.nextDouble();
		System.out.print("Comprimento do terreno:");
		altura = leia.nextDouble();
		
		m2 = base * altura;
		
		if(m2 < 100)
		{
			System.out.print("Este terreno � popular e possui o tamanho de "+m2+"m�");
		}
		else
			if(m2 <= 100 & base <= 500)
			{
				System.out.print("Este terreno � MASTER e possui o tamanho de "+m2+"m�");
			}
			else
				System.out.print("Este terreno � VIP e possui o tamanho de "+m2+"m�");

	}

}
