public class EmployeeUC4A {

	public static void main(String[] args) {
		int emp_Rate_Per_Hr = 20;
		int empHrs = 0;
		int empWage = 0;
		double empCheck = Math.floor(Math.random() * 10) % 2;
		//System.out.println(empCheck);
		if (empCheck == 1)
			empHrs = 8;
		else
			empHrs = 0;
		empWage = empHrs * emp_Rate_Per_Hr;
		System.out.println("Employee Wage: " + empWage);
	}

}
