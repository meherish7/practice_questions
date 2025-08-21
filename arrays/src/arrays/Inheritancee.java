package arrays;

class Animal{
	void eat() {
		System.out.println("eating");
	}
}
class b extends Animal{
	void bark() {
		System.out.println("barking");
	}
	
}

class Inheritancee{
	public static void main (String args[]) {
		b b=new b();
		b.eat();
		b.bark();
		
	}
}