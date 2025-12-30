package scenario_based;
public class EmployeeWages {
	static final int Wage_Per_Hour = 20;
	static final int Full_Day_Hours = 8;
	static final int Part_Time_Hours = 4;
	static final int Max_Working_Days = 20;
	static final int Max_Working_Hours = 100;

	public static void main(String[] args) {
		System.out.print("Welcome to Employee Wage Computation Program");
		System.out.println();
		//Use Case1
		System.out.println("Use Case 1.");
		boolean isPresent = useCase1();
		System.out.println("Employee is " + (isPresent? "Present" : "Absent"));
		System.out.println("----------------------------------------");
		
		//Use Case2
		System.out.println("Use Case 2.");
		double dailyWage = useCase2(isPresent);
		System.out.println("Daily Employee Wage: Rs." + dailyWage);
		System.out.println("----------------------------------------");
		
		//Use Case3
		System.out.println("Use Case 3.");
		int empType = useCase3();
		String type = empType == 1? "Part Time" : "Full Time";
		System.out.println("Employee is " + type);
		System.out.println("----------------------------------------");
		
		//Use Case4
		System.out.println("Use Case 4.");
		double switchWage = useCase4(empType);
		System.out.println("Employee is " + type + " and Daily Wage is Rs." + switchWage);
		System.out.println("----------------------------------------");
		
		//Use Case5
		System.out.println("Use Case 5.");
		double monthlyWage = useCase5();
		System.out.println("Monthly Wage: Rs" + monthlyWage);
		System.out.println("----------------------------------------");
		
		//Use Case6
		System.out.println("Use Case 6.");
		double conditionalWage = useCase6();
		System.out.println("Wage till max hours/days reached: Rs." + conditionalWage);
		System.out.println("----------------------------------------");
		
	}

	// Attendance
	static boolean useCase1() {
		return (int) (Math.random() * 2) == 1;
	}
	
	//Daily Wage based on attendance
	static double useCase2(boolean present) {
		return present ? Wage_Per_Hour * Full_Day_Hours : 0; 
	}
	
	// Employee Type
	static int useCase3() {
		return (int)(Math.random()*2)==0? 1:2;
	}
	
	// Wage Calculation
	static double useCase4(int empType) {
		int hours;
		switch(empType) {
		case 1:
			hours = Part_Time_Hours;
			break;
		case 2:
			hours = Full_Day_Hours;
			break;
			default:
				hours=0;
		}
		return hours*Wage_Per_Hour;
	}
	
	// Monthly Wage(20 days)
	static double useCase5() {
		double total=0;
		for(int day =1; day<=Max_Working_Days;day++) {
			int empType=useCase3();
			total+=useCase4(empType);
		}
		return total;
	}
	
	// Wage till max hours or days
	static double useCase6() {
		int totalHours=0;
		int totalDays=0;
		double totalWage=0;
		while(totalHours<Max_Working_Hours && totalDays<Max_Working_Days) {
			totalDays++;
			int empType=useCase3();
			int hours=empType == 1 ? Part_Time_Hours : Full_Day_Hours;
			totalHours += hours;
			totalWage+= hours*Wage_Per_Hour;
		}
		return totalWage;
	}
}
