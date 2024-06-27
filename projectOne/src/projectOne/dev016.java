package projectOne;
import java.util.Scanner;
public class dev016 
{
	public static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) 
	{
		double cigarro,ano,tempoperdidominutos,tempoperdidodias;
		
		System.out.print("Digite quantos cigarros voce fuma por dia:");
		cigarro = leia.nextDouble();
		
		System.out.print("Digite a quantos anos voce fuma:");
		ano = leia.nextDouble();
		
		tempoperdidominutos = cigarro * 10 * 365 * ano;
		tempoperdidodias = tempoperdidominutos / (60 * 24);
		
		System.out.print("\nVoce perdeu exatamente "+tempoperdidodias+" dias de vida");

	}

}
