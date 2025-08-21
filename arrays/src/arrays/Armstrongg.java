package arrays;

public class Armstrongg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=153, temp=n,temp2=0,digit=0,count=0;
			double	sum=0;
		while(temp>0) {
			temp=temp/10;
			count++;
			System.out.println(count);
		}
		temp2=n;
		while(temp2>0){
			digit=temp2%10;
			sum=sum+Math.pow(digit,count);
			temp2=temp2/10;
			
			
		}
		if(sum==n) {
			System.out.println("armstrong");
		}
		else {
			System.out.println("not armstrong");
		}

	}

}
