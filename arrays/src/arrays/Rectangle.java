package arrays;

public class Rectangle {
	private double length;
	private double width;
	double area;
   Rectangle(double l,double w){
	   length=l;
	   width=w;
	   
   }
   public double calculatearea() {
	 area= length*width;
	 System.out.println("area "+area);
	 return area;
	 
   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r=new Rectangle(5.5,7.5);
		r.calculatearea();

	}

}
