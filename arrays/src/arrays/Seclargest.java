package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Seclargest {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int[] arr= {12,45,67,23,89,45};
		
		int secondlargest=arr [0];
		int largest=arr [0];
	
		for(int i=1;i<arr.length;i++) {
				if(arr[i]>largest) {
					secondlargest=largest;
					largest=arr[i];	   
				}	
		}
		System.out.println(secondlargest);
		System.out.println(largest);
		System.out.println(Arrays.toString(arr));
	}

}
