import java.util.*;
public class empWage
{

    static final int isFullTime=2;
    static final int isPartTime=1;
    static final int MAX_HRS_IN_MONTH=100;
    static int empRatePerHour=20;
    static int numWorkingdays=20;
    static int totalEmpHours=0;
    static int totalWorkingDays=0;
    public static int getWorkingHours(int check)
    {
        int hours;
        switch(check)
        {
            case isFullTime:
                hours=8;
                break;
            case isPartTime:
                hours=4;
                break;
            default:
                hours=0;
                break;
        }
        return hours;
    }
    public static int isPresent()
    {
         Random rd = new Random();
         int randomCheck=rd.nextInt()%3;
         return randomCheck;
    }
    public static void calcWage()
    {
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
    }

 public static void main(String args[])
 {
   System.out.println("Welcome to Employee Wage Computation");
   empWage employee = new empWage();
   employee.calcWage();
 }
}










