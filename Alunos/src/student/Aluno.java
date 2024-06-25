package student;

public class Aluno {
	
	public String name;
	public double firstSemester;
	public double seccSemester;
	public double thirdSemester;

	
	public double Grade() {
		return firstSemester + seccSemester + thirdSemester;
		 
	}
	public double Situation() {
		if (Grade() >= 60.00) {
			return 0.0;
		}else {
			return 60 - Grade();
		}
	}
	
	

}
