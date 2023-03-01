public class EmployeeWageComputation {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;

    public static void main(String[] args) {
        int empWage = 0, empHrs = 0, totalEmployeewage = 0, totalEmpHrs = 0, totalWorkingDays = 0;
        int wagePerHour = 20, workingDay = 20;
        while (totalEmpHrs < 100 && totalWorkingDays < workingDay) {
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
            empWage = empHrs * wagePerHour;
            totalEmployeewage = totalEmployeewage + empWage;
        }
        System.out.println("Total Employee WorkingDays is: " + totalWorkingDays);
        System.out.println("Total Employee WorkingHour is: " + totalEmpHrs);
        System.out.println("Total Employee Wage is: " + totalEmployeewage);

    }
}
