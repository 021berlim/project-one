package projectOne;
import java.util.Scanner;
public class dev018 
{
	public static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) 
	{
		float idade, anonasc, anoatual = 2024;
		
		System.out.print("Digite o ano de nascimento: ");
		anonasc = leia.nextFloat();
		
		idade = anoatual - anonasc;
		
		if (idade >=16){
			System.out.print("Ela pode votar, pois tem "+idade+" anos");
		}
		else
			System.out.print("Não pode votar pois tem "+idade+" anos");

	}
}
