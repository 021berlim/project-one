package projectOne;
import java.util.Scanner;
public class dev039 {
	public static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		
		int a,b,c;
		System.out.print("Informe os valores solicitados abaixo:\n");

		System.out.print("Valor A:");
		a = leia.nextInt();
		System.out.print("Valor B:");
		b = leia.nextInt();

		if(a != b)
		{
			c = a * b;
			System.out.print("A e B eram diferentes ent�o o resultado foi multiplicado e o resultado da conta foi: "+c+"");
		}
		else
		{
			c = a + b;
			System.out.print("A e B eram iguais ent�o o resultado foi somado e o resultado da conta foi: "+c+"");
		}

	}

}
