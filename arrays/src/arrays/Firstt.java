package arrays;

public class Firstt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//power bill
		int units=200;
		float price=0.0f;
		if(units>=50 && units<=100)
			price=units*1.0f;
		else if(units>100&&units<=200)
			price=units*2.0f;
		else if(units>200&&units<=300)
			price=units*3.0f;
		else
			price=units*5.0f;
		System.out.println("price value is"+price);
			

	}

}
