package arrays;

public class Student {
	
	private String name;
	private int age;
	private float gpa;
	Student(String n,int a,float g){
		name=n;
		age=a;
		gpa=g;
	}
	Student(String n,int a){
		name=n;
		age=a;
	}

	public void displaygpa() {
		System.out.println("gpa "+gpa);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student("meherish",22,10);
		s.displaygpa();
		System.out.println("name "+s.name);
		System.out.println("age "+s.age);
		
		
		
		

	}

}
