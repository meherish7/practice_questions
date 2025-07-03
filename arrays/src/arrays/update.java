package arrays;
import java.util.ArrayList;
public class update {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> colors=new ArrayList<>();
		colors.add("green");
		colors.add("pink");
		colors.add("yello");
		System.out.println("before updating colo"+colors);
		int index=colors.indexOf("green");
		if(index!=-1) {
			colors.set(index,"orange");
			System.out.println("updated list"+colors);
		}
			
			else {
				System.out.println("not found");
			
			
			}
	}
}

	



