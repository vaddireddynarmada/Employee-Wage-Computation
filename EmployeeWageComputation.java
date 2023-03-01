public class EmployeeWageComputation {
    public static void main(String[] args) {
        int present = 1;
        int wagePerHour = 20;
        int workingHour = 0;
        int attendance = (int) (Math.random() * 100) % 2;

        if (present == attendance) {
            System.out.println("employee is present");
            workingHour = 8;

        } else {
            System.out.println("employee is absent");
        }

        int wage = wagePerHour * workingHour;
        System.out.println("Employee daily wage: " + wage + " Rupees.");
    }
}