class EmpWageComputation 
{
  public static final int IS_PART_TIME = 1;
  public static final int IS_FULL_TIME = 2;
  public static final int empRatePerHr = 20;
  public static final int NUM_OF_WORKING_DAYS=20;
  public static final int MAX_HOURS_IN_MONTH=100; 
  int empHrs = 0;
  int empWage=0;
  int totalEmpWage=0;
  int totalWorkingHrs = 0;
  int totalWorkingDays=0;

  public void wageComputation()
  {
     empWage=empHrs*empRatePerHr;
     totalEmpWage+=empWage;
     totalWorkingHrs+=empHrs;
     System.out.println("Employee's day " + totalWorkingDays + " Wage is: " +empWage);
  }
  public void computation()
  {
     while(totalWorkingDays<NUM_OF_WORKING_DAYS && totalWorkingHrs<MAX_HOURS_IN_MONTH)
     {
        totalWorkingDays++;
        int empCheck = (int) Math.floor(Math.random() * 10) % 3;
        switch (empCheck) 
           {
		case IS_FULL_TIME : 
                      System.out.println("Employee is full time working");
		      empHrs = 8;
		      break;
		case IS_PART_TIME :
                      System.out.println("Employee is working part time");
		      empHrs = 4;
		      break;
		default :
                      System.out.println("Employee is absent");
		      empHrs = 0;
	   }
        wageComputation();
      }   
     System.out.println("Total working hours in month:"+totalWorkingHrs);
     System.out.println("Total monthly wages is:"+totalEmpWage);
  }
     
  public static void main(String args[]){
        EmpWageComputation obj=new EmpWageComputation();
        obj.computation();
    }
 }
