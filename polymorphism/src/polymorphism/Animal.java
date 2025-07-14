package polymorphism;



 class Apple {
	void sound() {
		System.out.println("animal make sound");
	}
}
class dog extends Apple{
	void sound() {
		System.out.println("dog make sound");
		
	}
}
class cat extends Apple{
	void sound() {
		System.out.println("cat make sound");
		
	}
}
public class Animal{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Apple a1=new dog();
		Apple a2=new cat();
		a1.sound();
		a2.sound();
		

	}
}
