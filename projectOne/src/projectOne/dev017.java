package projectOne;
import java.util.Scanner;
public class dev017 {
	public static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		double km, contakm;
		
		System.out.print("Informe a velocidade do veiculo: ");
		km = leia.nextDouble();
		
		if (km > 80)
		{
			contakm = (km - 80)*5;
			System.out.print("O veiculo foi multado no valor de R$"+contakm+" reais, pois estava na velocidade acima da permitida");
		}
		else
			System.out.print("O veiculo não foi multado.");

	}

}
