import java.util.*;
public class empWage implements employeeInterface
{
    static final int isFullTime=2;
    static final int isPartTime=1;
    
    static int noOfComp=0;
    companyEmpWage employee [];
    int totalEmpHours=0;
    

    empWage(int n)
    {
	employee = new companyEmpWage[n];
    }

    public void addCompany(String name, int rate, int workingHrs, int workingDays)
    {
	employee[noOfComp++]=new companyEmpWage(name,rate,workingHrs,workingDays);
    }
    public int getWorkingHours(int check)
    {
        int workHours;
        switch(check)
        {
            case isFullTime:
                workHours=8;
                break;
            case isPartTime:
                workHours=4;
                break;
            default:
                workHours=0;
                break;
        }
        return workHours;
    }

    public int isPresent()
    {
         Random rd = new Random();
         int randomCheck=rd.nextInt()%3;
         return randomCheck;
    }

    public void computeWage()
    {
	for(int i=0;i<noOfComp;i++)
	{
		employee[i].setTotalEmpWage(calcWage(employee[i]));
		System.out.println(employee[i]);
	}
    }
    public int calcWage(companyEmpWage employee)
    {
 	System.out.println("Company Name: "+employee.companyName);
        int attendance=0,workHours=0,dailySalary=0,totalSalary=0,totalWorkingDays=0;
        System.out.println("Day\t Daily Hours\t Total Hours\t Daily Wage\t Total Wage");
        while((totalEmpHours< employee.MAX_HRS_IN_MONTH) && (totalWorkingDays < employee.numWorkingdays))
        {
            totalWorkingDays++;
            attendance=isPresent();
            workHours=getWorkingHours(attendance);
            totalEmpHours+=workHours;
            dailySalary=workHours*employee.empRatePerHour;
            totalSalary=totalEmpHours*employee.empRatePerHour;
            System.out.println(totalWorkingDays+"\t\t"+workHours+"\t\t"+totalEmpHours+"\t\t"+dailySalary+"\t\t"+totalSalary);
        }
        return totalSalary;
    }

 

    public static void main(String args[])
    {
   	   System.out.println("Welcome to Employee Wage Computation");
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the no. of companies:");
	   int n = sc.nextInt();
           empWage emp = new empWage(n);
	   for(int i=0;i<n;i++)
	   {
	     System.out.println("Enter the name of the company:");
	     String name=sc.next();
	     System.out.println("Enter employee rate per hour: ");
	     int rate=sc.nextInt();
	     System.out.println("Enter total working days: ");
	     int workingDays=sc.nextInt();
	     System.out.println("Enter total working hours: ");
	     int workingHours=sc.nextInt();
	     //empWage company = new empWage(name,rate,workingDays,workingHours);
	     //company.calcWage();
             emp.addCompany(name,rate,workingDays,workingHours);
	     //System.out.println(company);
	   }
	   emp.computeWage();
     }
}
