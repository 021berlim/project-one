package projectOne;
import java.util.Scanner;
public class dev015 
{
	public static Scanner leia = new Scanner(System.in);
	public static void main(String[] args)
	{
		double dia,contasalario;
		
		System.out.print("Digite quantos dias este funcionario trabalhou em 1 mes: ");
		dia = leia.nextDouble();
		
		contasalario = (8*25)*dia;
		
		System.out.print("O funcionario ganha: R$"+contasalario+"");

	}

}
