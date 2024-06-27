package projectOne;
import java.util.Scanner;
public class dev006 
{
	public static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) 
	{
		float a,sucessor,antecessor;
		
		System.out.print("Digite um numero:");
		a = leia.nextFloat();
		
		sucessor = a + 1;
		antecessor = a - 1;	
		
		System.out.print("O antecessor do numero "+a+" é "+antecessor+", e o sucessor é "+sucessor+"");
		
	}

}
