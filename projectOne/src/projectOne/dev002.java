package projectOne;
import java.util.Scanner;
public class dev002 
{
	public static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) 
	{
		String  nome;
		System.out.print("Qual � seu nome?:");
		nome = leia.next();
		
		System.out.println("Ol� "+nome+" � um prazer te conhecer!");

	}

}
