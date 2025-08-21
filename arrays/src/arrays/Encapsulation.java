package arrays;
class productdetails{
	private int model_no;
	private float price;
	private String Product_type;
	
	
	public int getModel_no() {
		return model_no;
	}
	public void setModel_no(int model_no) {
		this.model_no = model_no;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getProduct_type() {
		return Product_type;
	}
	public void setProduct_type(String product_type) {
		Product_type = product_type;
	}
	productdetails(){
		
	}
	
}
class car{
	productdetails p;
	int speed;
	car(){
		p=new productdetails();
	}
	public void setdata() {
		speed=60;
		p.setModel_no(1234);
		p.setPrice(1000000);
		p.setProduct_type("petrol");
		
	}
	public void getdata() {
		System.out.println("speed"+speed);
		System.out.println("model"+p.getModel_no());
		System.out.println("price"+p.getPrice());
		System.out.println("ptype"+p.getProduct_type());
		
	}
	
}

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car c=new car();
		c.setdata();
		c.getdata();
		

	}

}
