public class EmployeeWageComputation {
    static final int FULL_TIME = 0;
    static final int PART_TIME = 1;

    public static void main(String[] args) {
        int wagePerHour = 20;
        int workingDay = 20;
        int totalEmpWage = 0;
        int attendance = (int) (Math.random() * 100) % 3;
        int workingHour = 0;
        for (int day = 1; day < workingDay; day++) {
            switch (attendance) {
                case FULL_TIME:
                    workingHour = 8;
                    break;
                case PART_TIME:
                    workingHour = 4;
                    break;
                default:
                    workingHour=0;
            }
            int empWage = workingHour * workingDay;
            totalEmpWage = totalEmpWage + empWage;
        }
        System.out.println("Employee Monthly wage: " + totalEmpWage + " Rupees.");
    }
}