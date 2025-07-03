package arrays;

import java.util.ArrayList;
import java.util.Collections;

public class sort {

	public static void main(String[] args) {
		ArrayList<String> colors=new ArrayList<>();
	    colors.add("green");
		colors.add("blue");
		colors.add("pink");
		colors.add("red");
		colors.add("orange"	);
		System.out.println("beforeupdation"+colors);
		Collections.sort(colors);
		System.out.println("after updation"+colors);
		// TODO Auto-generated method stub

	}

}
