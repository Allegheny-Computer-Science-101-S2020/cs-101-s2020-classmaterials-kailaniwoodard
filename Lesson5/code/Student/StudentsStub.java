import java.util.Arrays;
import java.util.Scanner;

public class StudentsStub {
	/** Main class for StudentsStub.
	*/
	public static void main(String[] args) {
		// Create new Scanner method for console input
		Scanner sc = new Scanner(System.in);
		// Prompt user for amount of students
		System.out.println("How many students?");
		int count = sc.nextInt(); // Save input to integer count
		Students obj[] = new Students[count]; // Establish obj[] with length count
		StudentsDriver driver = new StudentsDriver(); // Create new StudentsDriver object
		driver.loadStudents(obj); // Call loadStudents method
		driver.displayStudents(obj); // Call displayStudents method
	}
}
