import java.util.*;
public class empWage
{
 public static void main(String args[])
 {
   System.out.println("Welcome to Employee Wage Computation");
   int isPartTime=1;
   int isFullTime=2;
   int empRatePerHr=20;
   Random rd = new Random();
   int randomCheck=rd.nextInt()%3;
   int salary, empHrs;
   if(isFullTime == randomCheck)
   {
	empHrs=8;
   }
   else if(isPartTime == randomCheck)
   {
	empHrs=4;
   }
   else
   {
	empHrs=0;
   }
   salary=empHrs*empRatePerHr;
   System.out.println("Salary of the employee is: " +salary);
 }
}
