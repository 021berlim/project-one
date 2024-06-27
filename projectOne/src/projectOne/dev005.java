/*
 * 005) Programa para realizar o calculo da média de um aluno (limitado a 2 avaliações)
 */
package projectOne;
import java.util.Scanner;
public class dev005 
{
	public static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) 
	{
		float av1,av2,media;
		
		System.out.print("Digite abaixo as notas do aluno\n");
		System.out.print("Avaliação 1:");
		av1 = leia.nextFloat();
		
		System.out.print("Avaliação 2:");
		av2 = leia.nextFloat();
		
		media = (av1+av2)/2;
		System.out.print("A media entre "+av1+" e "+av2+" é: "+media+"\n");
	}

}
