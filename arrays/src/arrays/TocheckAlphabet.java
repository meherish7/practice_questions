package arrays;
import java.util.*;
public class TocheckAlphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a char or number or special character");
		char inp=sc.next().charAt(0);
		if(Character.isDigit(inp)) {
			System.out.println(inp+"digit");
		}
		else if(Character.isAlphabetic(inp)){
			System.out.println(inp+"is alphabet");	

	}else {
		System.out.println("special character");
		
	}

}
}
