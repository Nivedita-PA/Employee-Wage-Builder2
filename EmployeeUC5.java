public class EmployeeUC5 {
	
	public static final int full_Time = 1;
	public static final int part_Time = 2;
	public static final int emp_Rate_Per_Hr = 20;

	public static void main(String[] args) {
        int month_Days = 20 ;
		int empHrs = 0;
		int empWage = 0;
		double empCheck = Math.floor(Math.random() * 10) % 3;
		System.out.println("Employee Wage: " + empCheck);
		switch ((int)empCheck) {
		case full_Time:
			empHrs = 8;
			break;
		case part_Time:
			empHrs = 4;
			break;
		default:
			break; 
		}
		empWage = empHrs * emp_Rate_Per_Hr * month_Days;
		System.out.println("Employee Wage: " + empWage);
	
}
}
