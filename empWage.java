import java.util.*;
public class empWage
{

    static final int isFullTime=2;
    static final int isPartTime=1;
    static final int MAX_HRS_IN_MONTH=100;
    static int empRatePerHour;
    static int numWorkingdays;
    static int totalEmpHours;
    static String companyName;
    static int totalWorkingDays=0;
    empWage(String companyName, int empRatePerHour, int numWorkingDays,int totalEmpHours)
    {
        this.companyName=companyName;
        this.empRatePerHour=empRatePerHour;
        this.numWorkingdays=numWorkingDays;
        this.totalEmpHours=totalEmpHours;
    }

    public static int getWorkingHours(int check)
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
    public static int isPresent()
    {
         Random rd = new Random();
         int randomCheck=rd.nextInt()%3;
         return randomCheck;
    }
    public static void calcWage()
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
        System.out.println("Employee wage in company: "+companyName+" is "+totalSalary);
    }

 public static void main(String args[])
 {
   System.out.println("Welcome to Employee Wage Computation");
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the no. of companies:");
   int n = sc.nextInt();
   empWage employees[] = new empWage[n];
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
     employees[i]= new empWage(name,rate,workingDays,workingHours);
     employees[i].calcWage();
   }
 }

}
