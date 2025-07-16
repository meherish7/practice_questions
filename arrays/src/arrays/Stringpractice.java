package arrays;
import java.util.*;

public class Stringpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1=" abc  bef  cfg jhshhh";
		str1=str1.replaceAll("\\s" ," ").trim();
		String words[]=str1.split("\\s");
		System.out.println(Arrays.toString(words));
//		System.out.println(words.length);
		
//		System.out.println("apple");

	}

}
