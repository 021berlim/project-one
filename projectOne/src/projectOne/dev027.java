package projectOne;
import java.util.Scanner;
public class dev027 
{
	public static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) 
	{
		double av1, av2, media;
		
		System.out.print("Informe abaixo as informações solicitadas:\n");
		
		System.out.print("1 Avaliação:");
		av1 = leia.nextDouble();
		System.out.print("2 Avaliação:");
		av2 = leia.nextDouble();
		
		media = (av1 + av2)/2;
		
		if(media<0 || media>10)
		{
			System.out.print("Media não computada pois teve erro em alguma nota.");
		}
		else
			if(media < 5)
			{
				System.out.print("O Aluno foi reprovado.");
			}
			else
				if(media < 7)
				{
					System.out.print("O Aluno está de recuperação.");
				}
				else
					System.out.print("O Aluno foi aprovado.");
	}

}
