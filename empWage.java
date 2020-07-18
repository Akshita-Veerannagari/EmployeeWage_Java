import java.util.*;
public class empWage
{
 public static void main(String args[])
 {
   System.out.println("Welcome to Employee Wage Computation");
   int empRatePerHr=20;
   int MAX_HRS_IN_MONTH=100;
   int numWorkingDays=20;

   int totalEmpHrs=0;
   int totalWorkingDays=0;

   int empHrs,totalSalary=0;
   while((totalEmpHrs < MAX_HRS_IN_MONTH) && (totalWorkingDays<numWorkingDays))
   {
           totalWorkingDays++;
           Random rd = new Random();
           int randomCheck=rd.nextInt()%3;
           switch(randomCheck)
           {
                case 1:
                  empHrs=4;
                  break;
                case 2:
                   empHrs=8;
                   break;
                default:
                   empHrs=0;
                   break;
           }
           totalEmpHrs+=empHrs;
   }
   totalSalary=totalEmpHrs*empRatePerHr;
   System.out.println("Salary of the employee is: " +totalSalary);
 }
}










