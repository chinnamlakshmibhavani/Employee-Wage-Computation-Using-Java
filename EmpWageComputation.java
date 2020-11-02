class EmpWageComputation 
{
  public static final int IS_PART_TIME = 1;
  public static final int IS_FULL_TIME = 2;
  public static int computeEmpWage(String company,int empRatePerHr,int numOfWorkingDays,int maxHoursPerMonth) 
  {
  int empHrs = 0;
  int totalEmpHrs = 0;
  int totalWorkingDays=0;

  while(totalEmpHrs<=maxHoursPerMonth && totalWorkingDays<numOfWorkingDays)
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
           totalEmpHrs+=empHrs;
           System.out.println("Day: " + totalWorkingDays + " Emp Hr: " +empHrs);
          }
         int totalEmpWage=totalEmpHrs*empRatePerHr;
         System.out.println("Total employee wage for company: " +company+" is: "+totalEmpWage);
         return totalEmpWage;
       }
       public static void main(String args[]){
        computeEmpWage("DMart",20,2,10);
        computeEmpWage("Reliance",10,4,20);
      
    }
 }
