package projectOne;
import java.util.Scanner;
public class dev004 
{
	public static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) 
	{
	float a , b, soma;
	
	System.out.print("Digite os valores abaixo:\n");
	System.out.print("Valor A:");
	a = leia.nextFloat();
	System.out.print("Valor B:");
	b = leia.nextFloat();
	
	soma = a+b;
	System.out.print("A soma entre A e B é: "+soma+"\n");
	}

}
