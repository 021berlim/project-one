/*
 *   007. Crie um algoritmo que leia um número real e mostre na tela o seu dobro e a sua terça parte.
	Ex:
    • Digite um número: 3.5 O dobro de 3.5 é 7.0
    • A terça parte de 3.5 é 1.16666
 */
package projectOne;
import java.util.Scanner;
public class dev007 
{
	public static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) 
	{
		float number,dobro,tercaparte;
		System.out.print("Digite um numero real:");
		number = leia.nextFloat();
		
		dobro = number*2;
		tercaparte = number/3;
		
		System.out.print("O dobro do numero "+number+" é "+dobro+", e a terça parte é "+tercaparte+"");

	}

}