package arrays;

public class duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {1,2,3,4,5,6,2};
		boolean hasDuplicate =false;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1; j<arr.length; j++) {
				if( arr[i]==arr[j]) {
					hasDuplicate = true;
					break;
				}
			}
		}
		if(hasDuplicate) {
			System.out.println("found duplicate in array");
		}
		else {
			System.out.println("not found");
		}

	}

}
