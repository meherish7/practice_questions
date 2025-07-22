package arrays;

public class Nestediff1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=25,price=0;
		String day="weekday";
		if(day.equals("weekend"))
		{
			System.out.println("inside if");
			if(age<13)
			{
				price=40;
			}
			else if (age>65)
			{
				price=30;
			}
			else 
			{
				price=100;
			}
		}
		else if(day.equals("weekday")) {
			System.out.println("else");
			if(age<13)
			{
				price=30;
			}
			else if (age>65)
			{
				price=20;
			}
			else 
			{
				price=60;
			}
		}
           System.out.println("price"+price);
	}

}
