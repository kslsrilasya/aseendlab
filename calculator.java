public class EmployeeSalary {
    public static void main(String[] args) {
        int basicSalary = 20000;
        int bonus = 5000;
        int deduction = 2000;

        int unusedVariable = 1000;

        int totalSalary = basicSalary + bonus - deduction;

        System.out.println("Basic Salary = " + basicSalary);
        System.out.println("Bonus = " + bonus);
        System.out.println("Deduction = " + deduction);
        System.out.println("Total Salary = " + totalSalary);
    }
}
