package projectOne;
import java.util.Scanner;
public class dev030 
{
	public static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) 
	{
		double peso, altura , imc;
		
		System.out.println("INFORME OS DADOS SOLICITADOS ABAIXO:");
		System.out.print("Peso:");
		peso = leia.nextDouble();
		System.out.print("Altura:");
		altura = leia.nextDouble();
		
		imc = peso / (altura * altura);
		
		if(imc < 18.5)
		{
			System.out.print("Seu IMC est� abaixo do peso.");
		}
		else
			if(imc <= 19.5 & imc <= 25)
			{
				System.out.print("Seu IMC est� no peso ideal.");
			}
			else
				if(imc <= 25 & imc <= 30)
				{
					System.out.print("Seu IMC est� no nivel de sobrepeso.");
				}
				else
					if(imc <= 30 & imc <= 40)
					{
						System.out.print("Seu IMC est� no nivel de obesidade.");
					}
					else
						System.out.print("Seu IMC est� no nivel de obesidade m�rbida.");
	 }

}
