public class EmpWageComputation 
{
     public static void main(String[] args) 
     {
        int IS_FULL_TIME = 1;
	int empHrs = 0;
	int empWage = 0;
	int empRatePerHr = 20;

	double empCheck = Math.floor(Math.random() * 10) % 2;
	if (empCheck == IS_FULL_TIME)
        {
	     empHrs = 8;
        }
	else
        {
	     empHrs = 0;
        }

	empWage = empHrs * empRatePerHr;
	System.out.println("Employee Wage : " + empWage);
     }
}
