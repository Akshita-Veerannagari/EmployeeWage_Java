import java.util.*;
public class empWage
{
    int totalWage;
    static final int isFullTime=2;
    static final int isPartTime=1;
    static final int MAX_HRS_IN_MONTH=100;
    int empRatePerHour;
    int numWorkingdays;
    int totalEmpHours;
    String companyName;
    int totalWorkingDays=0;

    empWage(String companyName, int empRatePerHour, int numWorkingDays,int totalEmpHours)
    {
        this.companyName=companyName;
        this.empRatePerHour=empRatePerHour;
        this.numWorkingdays=numWorkingDays;
        this.totalEmpHours=totalEmpHours;
        this.totalWage=0;
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


    public void calcWage()
    {
 	      System.out.println("Company Name: "+companyName);
        int attendance=0,workHours=0,dailySalary=0,totalSalary=0;
        System.out.println("Day\t Daily Hours\t Total Hours\t Daily Wage\t Total Wage");
        while((totalEmpHours< MAX_HRS_IN_MONTH) && (totalWorkingDays < numWorkingdays))
        {
           totalWorkingDays++;
            attendance=isPresent();
            workHours=getWorkingHours(attendance);
            totalEmpHours+=workHours;
            dailySalary=workHours*empRatePerHour;
            totalSalary=totalEmpHours*empRatePerHour;
            System.out.println(totalWorkingDays+"\t\t"+workHours+"\t\t"+totalEmpHours+"\t\t"+dailySalary+"\t\t"+totalSalary);
        }
        totalWage=totalSalary;
    }

    public String toString()
    {
        return "Total EmployeeWage for Company: "+companyName+" is "+totalWage;
    }

    public static void main(String args[])
    {
   	System.out.println("Welcome to Employee Wage Computation");
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the no. of companies:");
	   int n = sc.nextInt();
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
	     empWage company = new empWage(name,rate,workingDays,workingHours);
	     company.calcWage();
	     System.out.println(company);
	   }
     }
}
