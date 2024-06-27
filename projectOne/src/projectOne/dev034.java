package projectOne;
import java.util.Scanner;
public class dev034 
{
	public static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int pontos, horadeatv;
		double dinheiro;
		
		System.out.print("Digite o total de horas de atividades físicas:");
		horadeatv = leia.nextInt();
		
		if(horadeatv < 10)
		{

			pontos = horadeatv * 2;
		}
		else
			if(horadeatv > 10 & horadeatv < 20)
			{

				pontos = horadeatv * 5;
     		}
			else
				pontos = horadeatv * 10;
		
		System.out.print("O total de pontos obtidos foi de "+pontos+" pontos!\n");
		dinheiro = pontos * 0.05;
		System.out.print("Total de pontos convertidos para dinheiro: R$"+dinheiro+"");

	}

}
