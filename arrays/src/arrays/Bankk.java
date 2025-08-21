package arrays;
class office{
	private String empname;
	private int empid;
	private double salary;
	
	office(){
		
	}

	public String getEmpname() {
		return empname;
	}

	public String setEmpname(String empname) {
		return this.empname = empname;
	}

	public int getEmpid() {
		return empid;
	}

	public int setEmpid(int empid) {
		return this.empid = empid;
	}

	public double getSalary(double i) {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
//	public void print() {
//		System.out.println("emp name"+empname);
//		System.out.println("empid"+empid);
//		System.out.println("salary"+salary);
//
//		
//	}

	
	
}
public class Bankk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		office f=new office();
		f.setEmpid(20);
		f.setEmpname("meherish");
		f.setSalary(100000000);
		
		
		int empid=f.setEmpid(20);
		System.out.println("empid "+empid);
		String empname=f.setEmpname("meherish");
		System.out.println("empname "+empname);
		double salary=f.getSalary(1000);
		System.out.println("salry "+salary);
		
		
		
//		f.getEmpid();
//		f.getEmpname();
//		f.getSalary();
		
		

	}

	

	

}
