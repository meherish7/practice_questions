package arrays;
class app{
	String name="meherish";
	int id=10;
	void printdata(){
		System.out.println("name "+name);
		System.out.println(" id "+id);
		
	}
	
	
}
class man extends app{
	int age=25;
	void update() {
		System.out.println("age "+age);
	}
	
}

public class Institute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		man m=new man();
		m.printdata();
		m.update();

	}

}

