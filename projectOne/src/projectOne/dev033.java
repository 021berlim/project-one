package projectOne;
import java.util.Scanner;
public class dev033 
{
	public static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) 
	{
		String modeloveiculo;
		double km, valorfinal;
		
		System.out.print("INFORME QUAL O MODELO DO VE�CULO: ");
		modeloveiculo = leia.next();
		
		System.out.print("Quantos KMs foram percorridos com o veiculo: ");
		km = leia.nextDouble();
		
		if (modeloveiculo == "L" || modeloveiculo == "l")
		{
			if(km <= 200)
			{
				valorfinal = km * 0.30 + 150;
				System.out.print("o valor mensal do ve�culo � "+valorfinal+"");
			}
			else
				valorfinal = km * 0.25 + 150;
				System.out.print("o valor mensal do ve�culo � "+valorfinal+"");
			
		}
		if(modeloveiculo == "p" || modeloveiculo == "P")
		{
			if(km <= 100)
		    {
				valorfinal = km * 0.20 + 90;
				System.out.print("o valor mensal do ve�culo � "+valorfinal+"");
			}
			else
				valorfinal = km * 0.10 + 90;
				System.out.print("o valor mensal do ve�culo � "+valorfinal+"");
		         
		    }
		else
		       System.out.print("modelo do ve�culo invalido");

	}

}
