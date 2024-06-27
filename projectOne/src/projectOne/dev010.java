package projectOne;
import java.util.Scanner;
public class dev010
{
	public static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) 
	{			
        float largura, altura, area, quantidadetinta;

        System.out.print("Digite a largura da parede: ");
        largura = leia.nextFloat();

        System.out.print("Digite a altura da parede: ");
        altura = leia.nextFloat();

        area = largura*altura;
		quantidadetinta = area/2;

        System.out.print("A area desta parede é: "+area+" Voce precisará¡ de "+quantidadetinta+" para pintar esta parede.");
	}

}
