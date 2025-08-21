package arrays;

public class Person {
	private String name;
	private int age;
    Person(String ant,int bat){
    	name=ant;
    	age=bat;
    }
    public void introduce() {
    	System.out.println("introducing person");
    	System.out.println("name "+name);
    	System.out.println("age "+age);
    	//System.out.println("introducing person");
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p=new Person("apple",10);
		p.introduce();
		Person p1=new Person("laddu",20);
		p1.introduce();

	}

}
