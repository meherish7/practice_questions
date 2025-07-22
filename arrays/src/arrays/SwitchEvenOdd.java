package arrays;

public class SwitchEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int val=9;
		switch(val%2) {
		case 0:
			System.out.println("even");
			break;
		case 1:
			System.out.println("odd");
			break;
		default:
			System.out.println("proper value enter");
		}

	}

}
