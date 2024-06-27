package projectOne;
import java.util.Scanner;
public class dev026
{
	public static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) 
	{
		String aluno;
		float av1, av2, av3,media;
	
		System.out.println("Informe os dados solicitados abaixo:");
		System.out.print("Nome do aluno:");
		aluno = leia.next();
		System.out.print("Teste:");
		av1 = leia.nextFloat();
		System.out.print("Prova:");
		av2 = leia.nextFloat();
		System.out.print("Trabalho:");
		av3 = leia.nextFloat();
		
		media = (av1 + av2 + av3)/3;
		
		System.out.println("Dados cadastrados:");
		System.out.println("Nome: "+aluno+"");
		System.out.println("Teste: "+av1+"");
		System.out.println("Prova: "+av2+"");
		System.out.println("Trabalho: "+av3+"");
		
		if(media<0 || media>10)
		{
			System.out.print("Media não computada pois teve erro em alguma nota.");
		}
		else
			if(media>=0 & media<4)
			{
				System.out.print("O "+aluno+" foi reprovado com media "+media+"");
			}
			else
				if(media>=4 & media<6)
				{
					System.out.print("O aluno"+aluno+" está de recuperação com media "+media+"");
				}
				else
					if(media>=7 & media<9)
					{
						System.out.print("O aluno"+aluno+" está aprovado com media "+media+"");
					}
					else
						if(media>9 & media <=10)
						{
							System.out.print("O aluno "+aluno+" está aprovado com louvor com media "+media+"");
						}					
		
	}

}
