package projectOne;
import java.util.Scanner;
public class dev023 
{
	public static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) 
	{
	String nomecliente,sexo;
	double valorcompra, contafinalm, contafinalf;
	
	System.out.print("Digite abaixo as informações listadas em seguida:\n");
	
	System.out.print("Nome:");
	nomecliente = leia.next();
	
	System.out.print("Sexo(F/M):");
	sexo = leia.next();
	
	System.out.print("Valor comprado:");
	valorcompra = leia.nextDouble();
	
	if (sexo.equals ("F") || sexo.equals("f"))
	{
		contafinalf = (valorcompra*13)/100 + valorcompra;
		System.out.print("Parabens "+nomecliente+" voce ganhou um desconto de 13% na sua compra, o valor total foi: "+contafinalf+"");
	}
	else
	{
		contafinalm = (valorcompra*5)/100 + valorcompra;
		System.out.print("Parabens "+nomecliente+" voce ganhou um desconto de 5% na sua compra, o valor total foi: "+contafinalm+"");
	}
	}

}
