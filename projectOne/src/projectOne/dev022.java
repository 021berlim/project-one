package projectOne;
import java.util.Scanner;
public class dev022 
{
	public static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) 
	{
	float anonasc, anos, idade;
		
	System.out.print("Informe o ano que o cidadão nasceu: ");
	anonasc = leia.nextFloat();
	
	idade = 2024 - anonasc;
	
	if (idade > 18)
	{ 
		anos = idade - 18;
		System.out.print("Voce deverá comparecer o exercito brasileiro para se alistar,pois ja completou a maioridade e se passou "+anos+" ano(s)");
	}
	else
		if (idade == 18)
		{
			System.out.print("Voce deverá comparecer o exercito brasileiro para se alistar este ano\n");
		}
		else
		{
			anos = 18 - idade;
			System.out.print("Voce deverá comparecer o exercito brasileiro para se alistar daqui a "+anos+" ano(s)");
		}
	
	}

}
