/*
 * 005) Programa para realizar o calculo da m�dia de um aluno (limitado a 2 avalia��es)
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
		System.out.print("Avalia��o 1:");
		av1 = leia.nextFloat();
		
		System.out.print("Avalia��o 2:");
		av2 = leia.nextFloat();
		
		media = (av1+av2)/2;
		System.out.print("A media entre "+av1+" e "+av2+" �: "+media+"\n");
	}

}
