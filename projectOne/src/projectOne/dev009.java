package projectOne;
import java.util.Scanner;
public class dev009
{
	public static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) 
	{			
        float saldo, saldodolar;

        System.out.println("Conversão de Real Para Dolar");

        System.out.print("Digite quantos reais voce possui na carteira: ");
        saldo = leia.nextFloat();

        saldodolar = (saldo)/5;

        System.out.print("Voce poderá¡ comprar: $"+saldodolar+" doláres");

	}

}

