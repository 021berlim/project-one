package projectOne;
import java.util.Scanner;
public class dev002 
{
	public static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) 
	{
		String  nome;
		System.out.print("Qual é seu nome?:");
		nome = leia.next();
		
		System.out.println("Olá "+nome+" é um prazer te conhecer!");

	}

}
