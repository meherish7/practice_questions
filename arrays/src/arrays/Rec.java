package arrays;

public class Rec {
     private double length;
     private double width;
	public double getLength() {
		return length;
	}
	 public void setLength(double length) {
		 this.length = length;
	 }
	 public double getWidth() {
		 return width;
	 }
	 public void setWidth(double width) {
		 this.width = width;
	 }
	 public double getarea() {
		double  Area=length*width;
		return Area;
	 }
	 public double getperimeter() {
		 double perimeter=2*length*width;
		 return perimeter;
				 
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Rec r= new Rec();
       r.getarea();
       r.getperimeter();
       r.setLength(2.5);
       r.setWidth(5.6);
       System.out.println( "area"+r.getarea());
       System.out.println("perimeter"+r.getperimeter());
	}
	

}
