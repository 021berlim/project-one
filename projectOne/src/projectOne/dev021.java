package projectOne;
import java.util.Scanner;
public class dev021 
{
	public static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) 
	{
	float ano;
	
	System.out.print("Digite um ano: ");
	ano = leia.nextFloat();
		
	if (ano % 4 == 0)
		System.out.print("Este ano é bissexto");
	else
		System.out.print("Este ano não é bissexto");

	}

}
