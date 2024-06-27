package projectOne;
import java.util.Scanner;
public class dev014 
{
	public static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) 
	{
		double km, dia, contavalor;
		
		System.out.print("Digite quantos km foram rodados com o veiculo: ");
		km = leia.nextDouble();
		
		System.out.print("Total de dias alugados: ");
		dia = leia.nextDouble();
		
		contavalor = (90*dia)+(0.20*km);

		System.out.print("O Total a ser pago pelo cliente é: R$"+contavalor+"");
	}

}
