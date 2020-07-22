import java.util.*;
public class empWage implements employeeInterface
{
    static final int isFullTime=2;
    static final int isPartTime=1;
    
    static int noOfComp=0;
    ArrayList<companyEmpWage> employee;
    Map<String, companyEmpWage> employeeMap;
    

    empWage(int n)
    {
	employee = new ArrayList<>();
	employeeMap = new LinkedHashMap<>();
	noOfComp=n;
    }

    public void addCompany(String name, int rate, int workingHrs, int workingDays)
    {
	companyEmpWage comp = new companyEmpWage(name,rate,workingHrs,workingDays);
	employee.add(comp);
	employeeMap.put(name,comp);
    }
    public int getWorkingHours(int check)
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

    public int isPresent()
    {
         Random rd = new Random();
         int randomCheck=rd.nextInt()%3;
         return randomCheck;
    }

    public void computeWage()
    {
	for(int i=0;i<noOfComp;i++)
	{
		employee.get(i).setTotalEmpWage(calcWage(employee.get(i)));
		System.out.println("Company Name: "+employee.get(i).companyName);
		System.out.println("Day\t Daily Hours\t Total Hours\t Daily Wage\t Total Wage");
		employee.get(i).printDailyWage();
		System.out.println(employee.get(i));
	}
    }
    public int calcWage(companyEmpWage employee)
    {
 	
        int attendance=0,workHours=0,dailySalary=0,totalSalary=0,totalWorkingDays=0,totalEmpHours=0;
        
        while((totalEmpHours< employee.MAX_HRS_IN_MONTH) && (totalWorkingDays < employee.numWorkingdays))
        {
	    ArrayList<Integer> daily = new ArrayList<>();
            totalWorkingDays++;
            attendance=isPresent();
            workHours=getWorkingHours(attendance);
            totalEmpHours+=workHours;
            dailySalary=workHours*employee.empRatePerHour;
            totalSalary=totalEmpHours*employee.empRatePerHour;
            daily.add(totalWorkingDays);
    	    daily.add(workHours);
	    daily.add(totalEmpHours);
	    daily.add(dailySalary);
	    daily.add(totalSalary);
	    employee.dailyWage.add(daily);
            //System.out.println(totalWorkingDays+"\t\t"+workHours+"\t\t"+totalEmpHours+"\t\t"+dailySalary+"\t\t"+totalSalary);
        }
        return totalSalary;
    } 

    public void getTotalWageByCompanyName(String companyName)
    {
	System.out.println("Total Wage of Company "+companyName+" is "+employeeMap.get(companyName).totalWage);
    }

    public static void main(String args[])
    {
   	   System.out.println("Welcome to Employee Wage Computation");
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the no. of companies:");
	   int n = sc.nextInt();
           empWage emp = new empWage(n);
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
	     //empWage company = new empWage(name,rate,workingDays,workingHours);
	     //company.calcWage();
             emp.addCompany(name,rate,workingDays,workingHours);
	     //System.out.println(company);
	   }
	   emp.computeWage();
	   String option="yes";
	   while(option.equals("yes"))
 	   {
		System.out.println("Enter the name of the company to find total Wage:");
		String name=sc.next();
		if(emp.employeeMap.containsKey(name))
			emp.getTotalWageByCompanyName(name);
		else
			System.out.println("Company doesnt exist");
		System.out.println("Do you want to continue yes/no?");
		option=sc.next();
	   }
     }
}
