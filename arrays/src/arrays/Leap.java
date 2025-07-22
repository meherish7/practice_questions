package arrays;

public class Leap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=2000;
		
		if(i%4==0||i%100==0&&i%400==0) {
			System.out.println("leap year");
			
		}
		else {
			System.out.println("not leap");
		}

	}

}
