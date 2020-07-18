import java.util.*;
public class empWage
{
 public static void main(String args[])
 {
   System.out.println("Welcome to Employee Wage Computation");
   int isPresent=1;
   Random rd = new Random();
   int randomCheck=rd.nextInt()%2;
   if(isPresent == randomCheck)
	System.out.println("Employee is present");
   else
	System.out.println("Employee is absent");
 }
}
