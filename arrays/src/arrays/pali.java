package arrays;

public class pali {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,2,1};
		int size=arr.length;
		System.out.println(size);
		boolean flag=true;
		int last=size-1;
		for(int i=0;i<size/2;i++) {
			if(arr[i]!=arr[last]) {
				flag=false;
				break;
			}
			last --;
			
		}
		if(flag==true) {
			System.out.println("palindrome");
		}else {
			System.out.println("not palindrome");
			System.out.println("not");
		}
		
		

	}
}

//}
//int arr[]= {1,2,3,2,1};
//int size=arr.length;
//System.out.println(size);
//boolean flag=true;
//int last=size-1;
//for(int i=0;i<size/2;i++) {
//	if(arr[i]!=arr[last]) {
//		flag=false;
//		break;
//	}
//	last --;
//	
//}
//if(flag==true) {
//	System.out.println("palindrome");
//}else {
//	System.out.println("not palindrome");
//}
