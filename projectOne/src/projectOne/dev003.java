package projectOne;
import java.util.Scanner;
public class dev003 {

	public static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		String nome;
		float salario;
		
		System.out.print("Nome do funcion�rio:");
		nome = leia.next();
		
		System.out.print("Qual � o salario do funcionario?:");
		salario = leia.nextFloat();
		
		System.out.println("O funcion�rio "+nome+" tem um sal�rio de R$"+salario+" reais no m�s de junho");

	}

}
