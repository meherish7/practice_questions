package arrays;

public class Personn {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age>=0) {
			
		
		this.age = age;}
		else {
			this.age=0;
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Personn p=new Personn();
       p.setName("meherish");
       p.setAge(20);
     int   a=p.getAge();
     String  b= p.getName();
      

     System.out.println("age"+a);
       System.out.println("name"+b);
	}
}
