package arrays;
import java.util.Scanner; 
 

public class department_performance_analyzer {
	    public static void main(String[] args) { 
	        Scanner sc = new Scanner(System.in); 
	 
	        // Step 1: Input Dimensions 
	        System.out.print("Enter number of departments: "); 
	        int depCount = sc.nextInt(); 
	 
	        System.out.print("Enter number of students per department: "); 
	        int studentCount = sc.nextInt(); 
	 
	        System.out.print("Enter number of subjects: "); 
	        int subjectCount = sc.nextInt(); 
	 
	        // Step 2: Declare Data Arrays 
	        String[][] names = new 
	String[depCount][studentCount]; 
	        int[][][] marks = new 
	int[depCount][studentCount][subjectCount]; 
	 
	        // Step 3: Input Data 
	        for (int d = 0; d < depCount; d++) { 
	            System.out.println("\n--- Input for Department " + (d + 1) + " ---"); 
	            for (int s = 0; s < studentCount; 
	s++) { 
	                sc.nextLine(); // buffer flush 
	                System.out.print("Enter name of Student " + (s + 1) + ": "); 
	                names[d][s] = sc.nextLine(); 
	 
	                for (int sub = 0; sub < subjectCount; sub++) { 
	                    System.out.print("Enter marks for Subject " + (sub + 1) + ": "); 
	                    marks[d][s][sub] = sc.nextInt(); 
	                } 
	            } 
	        } 
	 
	        // Step 4: Analysis Per Department 
	        for (int d = 0; d < depCount; d++) { 
	            System.out.println("\n===== Department " + (d + 1) + " Report ====="); 
	 
	            int departmentTotal = 0; 
	            int passCount = 0; 
	            int topperScore = -1; 
	            String departmentTopper = ""; 
	 
	            for (int s = 0; s < studentCount; 
	s++) { 
	                int studentTotal = 0; 
	                boolean isPass = true; 
	 
	                for (int sub = 0; sub < 
	subjectCount; sub++) { 
	                    studentTotal += 
	marks[d][s][sub]; 
	                    if (marks[d][s][sub] < 35) { 
	                        isPass = false; 
	                    } 
	                } 
	 
	                float average = (float) 
	studentTotal / subjectCount; 
	                char grade = average >= 90 ? 'A' : 
	                             average >= 75 ? 'B' : 
	                             average >= 60 ? 'C' : 
	                             average >= 35 ? 'D' : 'F'; 
	 
	                if (studentTotal > topperScore) { 
	                    topperScore = studentTotal; 
	                    departmentTopper = 
	names[d][s]; 
	                } 
	 
	                if (isPass) passCount++; 
	 
	                departmentTotal += 
	studentTotal; 
	 
	                // Student Summary 
	                System.out.println("Name: " + 
	names[d][s]); 
	                System.out.println("Total: " + studentTotal + " | Avg: " + average + " | Grade: " + grade); 
	                System.out.println("Status: " + 
	(isPass ? "PASS" : "FAIL")); 
	                System.out.println("-----------------------------"); 
	            } 
	 
	            // Department Summary 
	            float departmentAvg = (float) 
	  departmentTotal / (studentCount * subjectCount); 
	            float passPercentage = (float) 
	  passCount / studentCount * 100; 
	 
	            System.out.println("🧾 Department Average Score: " + departmentAvg); 
	            System.out.println("📊 Pass Percentage: " + passPercentage + "%"); 
	            System.out.println("🏆 Topper: " +departmentTopper);

}
	    }
}
