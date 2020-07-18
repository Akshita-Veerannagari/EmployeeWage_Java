import java.util.*;
public class empWage
{
 public static void main(String args[])
 {
   System.out.println("Welcome to Employee Wage Computation");
   int empRatePerHr=20;
   int salary=0,empHrs;
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
    System.out.println("Salary of the employee is: " +salary);
 }
}
