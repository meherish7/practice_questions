package arrays;

public class Palindrome {

	public static void main(String[] args) {
		int arr[]= {1,2,3,2,1};
		int size=arr.length;
		System.out.println(size);
		int[] temp=new int[5];
		int count=0;
		for(int i=size-1;i>=0;i--) {
			 temp[count]=arr[i];
			 count++;
			}
		boolean flag=true;
		for(int i=0;i<size;i++) {
			if(arr[i]!=temp[i]) {
				flag=false;
				break;
				
				
			}
//			else {
//				flag=false;
//				break;
//			}
			
	}
		if(flag==true) {
			System.out.println("palindrome");
		}else {
			System.out.println("not a palindrome");
		}
		
		
		
		
	}
}
		// TODO Auto-generated method stub
//		int arr[]= {1,2,3,2,1};
//		int size=arr.length;
//		System.out.println(size);
//		int[] temp=new int[5];
//		int count=0;
//		for(int i=size-1;i>=0;i--) {
//			temp[count]=arr[i];
//			count++;
//				}
//		boolean flag=true;
//		for(int i=0;i<size;i++) {
//		  if(arr[i]==temp[i]){
//			  
//		  }
//		  else {
//			    flag=false; 
//			    break;
//		  }
//			
//			
//		}
//		if(flag==true) {
//			System.out.println("palindrome");
//		}else {
//			System.out.println("not a palindreome");
//		}
//		
//
//	
//
//}
//}
