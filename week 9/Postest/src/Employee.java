public class Employee {
    protected double baseSalary;

    public Employee(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double calculateSalary() {
        return baseSalary;
    }

    public double calculateSalary(boolean withBonus) {
        return withBonus ? baseSalary * 1.1 : baseSalary;
    }
}