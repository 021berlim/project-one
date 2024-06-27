package projectOne;
import java.util.Scanner;
public class dev019 
{
	public static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) 
	{
		String nome;
		double nota1, nota2, media;
		
		System.out.println("Informe os dados solicitados abaixo:\n");
		
		System.out.print("Nome do aluno: ");
		nome = leia.next();
		
		System.out.print("Primeira nota:");
		nota1 = leia.nextDouble();
		
		System.out.print("Segunda nota:");
		nota2 = leia.nextDouble();
		
		media = (nota1+nota2)/2;
		
		if (media >7)
		{
			System.out.print("O aluno "+nome+" teve um bom rendimento este trimestre pois ficou com a media "+media+"\n");
		}
		else
			System.out.print("O aluno "+nome+" teve um rendimento ruim este trimestre pois ficou com a media "+media+"");

	}

}
