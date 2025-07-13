package arrays;
import java.util.Scanner;
public class Studentss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in) ;
		System.out.println("enter the no students");
		int students=sc.nextInt();
		int A=0;
		int B=0;
		int C=0;
		int D=0;
		int E=0;
		int F=0;
		int max=0;
		int low=100;
		
		
		for(int i=0;i<students;i++) {
			System.out.println("enter marks"+(i+1));
			int marks=sc.nextInt();
			while(marks<0 || marks>100) {
				System.out.println("re enter marks"+i+"beteen 0 to 100");
				 marks=sc.nextInt();}
			if(marks>90 && marks<100) {
			   A+=1;
			
			} 
			else if(marks>80 && marks<90){
				
				B+=1;
			}
			else if(marks>70 && marks<80) {
				C+=1;
			}
			else if(marks>60 && marks<70) {
			    D+=1;
			}
			else if(marks>50 && marks<60) {
				E+=1;
			}
			else {
				F+=1;
				if(marks>max) 
					max=marks;
				if(marks<low)
					low=marks;
					
				
			}
			}
		System.out.println("no students"+students);
		System.out.println("no of stud grade a"+A);
		System.out.println("no of stud grade b"+B);
		System.out.println("no of stud grade c"+C);
		System.out.println("no of stud grade d"+D);
		System.out.println("no of stud grade e"+E);
		System.out.println("no of stud grade f"+F);
		System.out.println("max marks"+max);
		System.out.println("low marks"+low);
		
		}
		
		

	}


