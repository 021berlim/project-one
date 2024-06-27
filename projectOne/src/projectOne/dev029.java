package projectOne;
import java.util.Scanner;
public class dev029 {
	public static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		double salario, valorcasa, valorprestacao,valor30porcento, pgano;
		
		System.out.println("INFORME OS DADOS SOLICITADOS ABAIXO:");
		System.out.print("Salário:");
		salario = leia.nextDouble();
		System.out.print("Valor da casa:");
		valorcasa = leia.nextDouble();
		System.out.print("Em quantos anos o emprestimo será pago?:");
		pgano = leia.nextDouble();
		
		valorprestacao = valorcasa/(12 * pgano);
		valor30porcento = salario * 0.30;
		
		if(valorprestacao < valor30porcento)
		{
			System.out.print("Seu emprestimo foi aprovado!, o valor dá prestação mensal é: "+valorprestacao+"");
		}
		else
			System.out.print("Seu emprestimo foi negado, o valor dá prestação excedeu os 30% de sua renda mensal.");

	}

}
