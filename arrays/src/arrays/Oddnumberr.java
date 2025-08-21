package arrays;

public class Oddnumberr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=1;i<=10;i++) {
			if(i%2!=0) {
				System.out.println(i);
				count++;
			}
			if(count==3) {
				break;
			}
			else {
				continue;
			}
			
		}

	}

}
