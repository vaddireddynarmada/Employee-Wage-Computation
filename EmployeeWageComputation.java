public class EmployeeWageComputation {
    public static void main(String[] args) {
        int fullTime = 1;
        int partTime = 2;
        int wagePerHour = 20;
        int workingHour = 0;
        int attendance = (int) (Math.random() * 100) % 3;

        if (fullTime == attendance) {
            System.out.println("employee worked for full time");
            workingHour = 8;

        } else if (partTime == attendance) {
            System.out.println("employee worked for part time");
            workingHour = 4;

        } else {
            System.out.println("employee is absent");
        }

        int wage = wagePerHour * workingHour;
        System.out.println("Employee daily wage: " + wage + " Rupees.");
    }
}