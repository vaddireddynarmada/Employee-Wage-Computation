import java.util.Random;

public class EmployeeWageComputation {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    private final String company;
    private final int empRatePerHour;
    private final int numOfWorkingDays;
    private final int maxHoursPerMonth;
    private int totalEmpWage;

    public EmployeeWageComputation(String company, int empRatePerHour, int numOfWorkingDays,
                                   int maxHoursPerMonth) {
        this.company = company;
        this.empRatePerHour = empRatePerHour;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHoursPerMonth = maxHoursPerMonth;
    }

    public void empWageBuilder() {
        int empHrs = 0;
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;
        while (totalEmpHrs <= maxHoursPerMonth && totalWorkingDays < numOfWorkingDays) {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
            }
            totalEmpHrs = totalEmpHrs + empHrs;
        }
        totalEmpWage = totalEmpHrs * empRatePerHour;
    }

    @Override
    public String toString() {

        return "Total employee wage for " + company + " is " + totalEmpWage + "\n";
    }

    public static void main(String[] args) {
        System.out.println("Employee wage program to save total employee wage for each company");
        EmployeeWageComputation dMart = new EmployeeWageComputation("DMart", 20, 2, 10);
        EmployeeWageComputation reliance = new EmployeeWageComputation("Walmart", 10, 4, 20);
        dMart.empWageBuilder();
        System.out.println(dMart);
        reliance.empWageBuilder();
        System.out.println(reliance);
    }
}
