package arrays;

public class Occurences {
	public static void main(String args[]) {
		System.out.println("total occurences");
		int[] arr= {1,2,3,4,2,2,5,2,5};
		int target=2;
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				count++;
			}
		
		}
		System.out.println("total ocuurences are" +count);
	}

}
