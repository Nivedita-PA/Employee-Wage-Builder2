public class EmployeeUC5 {
	
	public static final int full_Time = 1;
	public static final int half_Time = 2;
	public static final int emp_Rate_Per_Hr = 20;
	public static final int num_Of_Working_Days = 20;

	public static void main(String[] args) {

		int empHrs = 0, empWage = 0, totalWage = 0;
		
		for (int day = 0; day < num_Of_Working_Days; day++) {
	double empCheck = Math.floor(Math.random() * 10) % 3;
		switch ((int)empCheck) {
		case full_Time:
			empHrs = 8;
			break;
		case half_Time:
			empHrs = 4;
			break;
		default:
			empHrs = 0; 
		}	
		empWage = empHrs * emp_Rate_Per_Hr;
		totalWage += empWage;
		System.out.println("Employee Wage: " + empWage);
	}
		System.out.println("Total employee Wage: " +totalWage);
}
}
