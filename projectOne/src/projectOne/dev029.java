package projectOne;
import java.util.Scanner;
public class dev029 {
	public static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		double salario, valorcasa, valorprestacao,valor30porcento, pgano;
		
		System.out.println("INFORME OS DADOS SOLICITADOS ABAIXO:");
		System.out.print("Sal�rio:");
		salario = leia.nextDouble();
		System.out.print("Valor da casa:");
		valorcasa = leia.nextDouble();
		System.out.print("Em quantos anos o emprestimo ser� pago?:");
		pgano = leia.nextDouble();
		
		valorprestacao = valorcasa/(12 * pgano);
		valor30porcento = salario * 0.30;
		
		if(valorprestacao < valor30porcento)
		{
			System.out.print("Seu emprestimo foi aprovado!, o valor d� presta��o mensal �: "+valorprestacao+"");
		}
		else
			System.out.print("Seu emprestimo foi negado, o valor d� presta��o excedeu os 30% de sua renda mensal.");

	}

}
