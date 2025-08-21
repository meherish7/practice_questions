package arrays;

class apple{
	String name="meherish";
	int id=10;
	void printdata(){
		System.out.println("name"+name);
		System.out.println("id"+id);
		
	}
	
	
}
class manager extends apple{
	int age=25;
	void update() {
		System.out.println("age"+age);
	}
	
}




public class Animuthyam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		manager m=new manager();
		m.printdata();
		m.update();


	}

}
