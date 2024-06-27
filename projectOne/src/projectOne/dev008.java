package projectOne;
import java.util.Scanner;
public class dev008 
{
	public static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) 
	{
		float metro, km, hm, cm, mm, dam, dm;
		
		
		System.out.print("Digite uma distancia em metros: ");
		metro = leia.nextFloat();
		
		km = metro/1000;
		hm = metro/100;
		cm = metro*100;
		mm = metro*1000;
		dam = metro/10;
		dm = metro*10;
		
		System.out.print("Conversão:\n\n");
		System.out.println("KM:"+km+"");
		System.out.println("HM:"+hm+"");
		System.out.println("Dam:"+dam+"");
		System.out.println("DM:"+dm+"");
		System.out.println("CM:"+cm+"");
		System.out.println("MM:"+mm+"");
			

	}

}

