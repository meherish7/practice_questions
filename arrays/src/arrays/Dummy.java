package arrays;

public class Dummy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				++count;
				System.out.print(j);
			}
			System.out.println(" ");
		}

	}

}
