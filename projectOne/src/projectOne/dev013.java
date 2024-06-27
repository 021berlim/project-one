package projectOne;
import java.util.Scanner;
public class dev013 
{
	public static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) 
	{
		double salario,porcentagem;
		
		System.out.print("Digite o salario do funcionario: ");
		salario = leia.nextDouble();
		
		porcentagem = salario*1.15;
		System.out.print("O Salario deste funcionario apos os reajuste é: R$"+porcentagem+"");

	}

}
