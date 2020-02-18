public class Students {

	private int studentID;
	private String studentName;
	private double studentGPA;

	/** Accessor method for Student ID.
	*/
	public int getStudentID(){
		return this.studentID;
	}

	/** Mutator method for setting Student ID.
	*/
	public void setStudentID(int studentID){
		this.studentID = studentID;
	}

	/** Accessor method for Student name.
	*/
	public String getStudentName(){
		return this.studentName;
	}

	/** Mutator method for setting Student name.
	*/
	public void setStudentName(String studentName){
		this.studentName = studentName;
	}

	/** Accessor method for Student GPA.
	*/
	public double getStudentGPA(){
		return this.studentGPA;
	}

	/** Mutator method for setting Student GPA.
	*/
	public void setStudentGPA(double studentGPA){
		this.studentGPA = studentGPA;

	}

}
