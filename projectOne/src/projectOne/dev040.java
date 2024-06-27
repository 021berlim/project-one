package projectOne;
import java.util.Scanner;
public class dev040 
{
	public static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) 
	{
		double numero;
		
		System.out.print("Digite um numero:");
		numero = leia.nextDouble();
		
		if(numero > 0)
		{
			System.out.print("O numero informado é positivo logo foi calculado o dobro e o resultado foi: "+numero*2+"");
		}
		else
			System.out.print("O numero informado é negativo logo foi calculado o triplo e o resultado foi: "+numero*3+"");
	}

}
