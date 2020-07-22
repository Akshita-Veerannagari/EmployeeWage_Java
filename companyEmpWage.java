import java.util.*;
public class companyEmpWage
{
    int totalWage;

    final int empRatePerHour;
    final int numWorkingdays;
    final int MAX_HRS_IN_MONTH;
    String companyName;
    ArrayList<ArrayList<Integer>> dailyWage;
 

    companyEmpWage(String companyName, int empRatePerHour, int numWorkingDays,int totalEmpHours)
    {
        this.companyName=companyName;
        this.empRatePerHour=empRatePerHour;
        this.numWorkingdays=numWorkingDays;
        this.MAX_HRS_IN_MONTH=totalEmpHours;
        this.totalWage=0;
	this.dailyWage=new ArrayList<>();
    }
  
    public void setTotalEmpWage(int wage)
    {
	this.totalWage=wage;
    }

    public void printDailyWage()
    {
	for(int i=0;i<dailyWage.size();i++)
	{
	  for(int j=0;j<dailyWage.get(0).size();j++)
	  {
		System.out.print(dailyWage.get(i).get(j)+"\t\t");
	  }
	  System.out.println();
	}
    }
    
    public String toString()
    {
	return "Total EmpWage for Company: "+companyName+" is "+totalWage;
    }

}
