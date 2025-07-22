package basics;
import java.util.Scanner;
public class Exp {

	public static void main(String[] args) {
		float base,height,area;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter values");
		base=sc.nextFloat();
		height=sc.nextFloat();
		area=base*height*0.5f;
		System.out.println(area);
		
		
		

	}

}
