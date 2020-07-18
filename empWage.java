import java.util.*;
public class empWage
{
 public static void main(String args[])
 {
   System.out.println("Welcome to Employee Wage Computation");
   int empRatePerHr=20;
   int totalSalary=0;
   int numWorkingDays=20;
   int salary=0,empHrs;
   for(int i=1;i<=numWorkingDays;i++)
   {
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
	   salary=empHrs*empRatePerHr;
	   totalSalary+=salary;
   }
   System.out.println("Salary of the employee is: " +totalSalary);
 }
}
