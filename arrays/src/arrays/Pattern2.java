package arrays;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				++count;
				System.out.format("%02d ",count);
				//System.out.print(i+j  +" "); //1,2,3,4,5,6,7,8,9, in the row and column
				//System.out.println(i+" "); //row number
				//System.out.println(j+" ");// column number in pattern
			}
			System.out.println(" ");
		}
		

	}

}
