package projectOne;
import java.util.Scanner;
public class dev003 {

	public static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		String nome;
		float salario;
		
		System.out.print("Nome do funcionário:");
		nome = leia.next();
		
		System.out.print("Qual é o salario do funcionario?:");
		salario = leia.nextFloat();
		
		System.out.println("O funcionário "+nome+" tem um salário de R$"+salario+" reais no mês de junho");

	}

}
