package basics;


import java.util.Scanner;
public class Apple {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the day");
		int day=sc.nextInt();
		
		switch(day) {
		case 1:
			System.out.println("mon");
			break;
		case 2:
			System.out.println("tue");
			break;
		case 3:
			System.out.println("wed");
			break;
		case 4:
			System.out.println("thu");
			break;
		case 5:
			System.out.println("fri");
			break;
		case 6:
			System.out.println("sat");
			break;
			
		case 7:
			System.out.println("sun");
			break;
		default:
			System.out.println("not valid");
		}
		
		
		
		// TODO Auto-generated method stub
//		int a=10;
//		int b=20;
//		
//		
//		a+=2;
//		
//		System.out.println(a);
//        a/=2;
//        System.out.println(a);
//        a*=2;
//        System.out.println(a);
//        a%=2;
//        System.out.println(a);
//        System.out.println(a==b);
//        System.out.println(a<=b);
//        System.out.println(a>=b);
//        System.out.println(a!=b);
//        
	
		
//    int grt=a>b?b:a;
//	System.out.println(grt);
//	int min=a<b?b:a;
//	System.out.println(min );
//	

	
	}

}
