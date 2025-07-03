package arrays;
import java.util.ArrayList;

public class remove {

	public static void main(String[] args) {
		
		ArrayList<String> colors=new ArrayList<>();
		colors.add("pink");
		colors.add("green");
		colors.add("orange");
		colors.add("yellow");
		System.out.println("before"+colors);
		colors.remove(1);
		colors.remove(2);
		System.out.println("after"+colors);

	}

}
