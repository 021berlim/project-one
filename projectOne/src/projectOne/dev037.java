package projectOne;
import java.util.Scanner;
public class dev037
{
	public static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) 
	{
		String nome, estadocivil, sexo;
		int anoscasada; 
		
		System.out.println("Informe os dados solicitados abaixo:");
		System.out.print("Nome:");
		nome = leia.next();
		System.out.print("Sexo(M/F):");
		sexo = leia.next();
		System.out.print("Estado Civil:");
		estadocivil = leia.next();
		
		if(sexo == "F" || sexo == "f")
		{
			if(estadocivil == "CASADA" || estadocivil == "casada" )
			{
				System.out.print("A quantos anos voc� � casada?:");
				anoscasada = leia.nextInt();
			}
		}
	}

}
