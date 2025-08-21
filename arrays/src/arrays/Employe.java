package arrays;

public class Employe {
	int empid;
	String empname;
	//private float esalary;
	class person extends Employe{
		private float esalary;	
	
	person(int id,String name,float salary){
		empid=id;
		empname=name;
		esalary=salary;
	}
	public void diaplay() {
		System.out.println("ename"+empname);
		System.out.println("empid");
	}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
