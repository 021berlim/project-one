package projectOne;
import java.util.Scanner;
public class dev035 
{
	public static Scanner leia = new Scanner(System.in);
	public static void main(String[] args)
	{
		double salario, novosalario;
		String genero;
		int anosdetrab;
		
		System.out.print("INFORME AS INFORMA��ES DO FUNCION�RIO ABAIXO:");
		
		System.out.print("Sal�rio atual:");
		salario = leia.nextDouble();
		System.out.print("G�nero:");
		genero = leia.next();
		System.out.print("H� quantos anos trabalha na empresa:");
		anosdetrab = leia.nextInt();
		
		if(genero == "F" || genero == "f")
		{
			if(anosdetrab < 15)
				novosalario = (salario * 0.05) + salario;
			else
				if(anosdetrab <= 15 & anosdetrab >= 20)
					novosalario = (salario * 0.12) + salario;
				else
					novosalario = (salario * 0.23) + salario;
		System.out.print("O valor do novo sal�rio � "+novosalario+"");
		}
		else
		 if(genero == "M" || genero == "m")
		 {
			if(anosdetrab < 20)
				novosalario = (salario * 0.03) + salario;
			else
				if(anosdetrab <= 20 & anosdetrab >= 30)
					novosalario = (salario * 0.13) + salario;
				else
					novosalario = (salario * 0.25) + salario;
			System.out.print("O valor do novo sal�rio � "+novosalario+"");

		 }
	}

}
