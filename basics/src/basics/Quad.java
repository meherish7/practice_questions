package basics;
import java.util.Scanner;
import java.lang.Math;


public class Quad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a,b,c;
      double r1,r2;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter values");
      a=sc.nextInt();
      b=sc.nextInt();
      c=sc.nextInt();
      r1=(-b+Math.sqrt(b*b-4*a*c))/(2*a);
      r2=(-b-Math.sqrt(b*b-4*a*c))/(2*a);
      System.out.println(r1+  "  " +r2);
//      System.out.println(r2);
      
	
	}

}
