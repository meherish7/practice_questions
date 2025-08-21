package arrays;

public class ContEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int n=123456789,evencount=0,oddcount=0,digit=0;
     do {
    	 digit=n%10;
    	 if(digit%2==0) {
    		 evencount++;
    	 }
    	 else {
    		 oddcount++;
    	 }
    	 n=n/10;
     }while(n>0) ;
     
     System.out.println("evencount"+evencount);
     System.out.println("oddcount"+oddcount);
     
	
	}

}
