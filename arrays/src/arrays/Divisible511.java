package arrays;

public class Divisible511 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=110;
		if((n%11==0)&&(n%5==0)) {
			System.out.println(n+"  divisble by both");
		}
		else {
			System.out.println("not divisible");
		}

	}

}

//if ((number % 5 == 0) && (number % 11 == 0)) {
//    System.out.println(number + " is divisible by both 5 and 11.");
//} else {
//    System.out.println(number + " is NOT divisible by both 5 and 11.");
//}