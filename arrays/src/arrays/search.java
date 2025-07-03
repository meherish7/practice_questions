package arrays;
import java.util.ArrayList;
import java.util.Scanner;
public class search {

	public static void main(String[] args) {
		ArrayList<String>colors=new ArrayList<>();
		colors.add("pink");
		colors.add("green");
		colors.add("yellow");
		colors.add("orange");
		Scanner sc=new Scanner(System.in);
        System.out.println("enter color to search");
        String searchcolors=sc.nextLine();
        if(colors.contains(searchcolors)) {
        	System.out.println(searchcolors+"found");
        }else {
        	System.out.println("not found");
        }
	}

}
