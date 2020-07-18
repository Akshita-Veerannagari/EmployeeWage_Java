import java.util.*;
public class empWage
{
 public static void main(String args[])
 {
   System.out.println("Welcome to Employee Wage Computation");
   int isPresent=1;
   Random rd = new Random();
   int randomCheck=rd.nextInt()%2;
   int salary;
   if(isPresent == randomCheck)
   {
	int empRatePerHr=20;
	int empHrs=8;
	salary=empHrs*empRatePerHr;
   }
   else
   {
	salary=0;
   }
   System.out.println("Salary of the employee is: " +salary);
 }
}
