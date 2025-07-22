package basics;
import java.util.Scanner;

public class VolumeOfCube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int l,b,h;
		int volume,area;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter values l,b,h");
		l=sc.nextInt();
		b=sc.nextInt();
		h=sc.nextInt();
		volume=l*b*h;
		area=2*(l*b+l*h+b*h);
		System.out.println("volume "+" "+volume + "  area"+" "+area);
//		System.out.println("area"+area);
		

	}

}
