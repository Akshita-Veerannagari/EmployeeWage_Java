public class companyEmpWage
{
    int totalWage;

    final int empRatePerHour;
    final int numWorkingdays;
    final int MAX_HRS_IN_MONTH;
    String companyName;
 

    companyEmpWage(String companyName, int empRatePerHour, int numWorkingDays,int totalEmpHours)
    {
        this.companyName=companyName;
        this.empRatePerHour=empRatePerHour;
        this.numWorkingdays=numWorkingDays;
        this.MAX_HRS_IN_MONTH=totalEmpHours;
        this.totalWage=0;
    }
  
    public void setTotalEmpWage(int wage)
    {
	this.totalWage=wage;
    }
    
    public String toString()
    {
	return "Total EmpWage for Company: "+companyName+" is "+totalWage;
    }

}
