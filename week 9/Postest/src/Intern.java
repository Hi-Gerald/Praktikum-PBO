class Intern extends Employee {
    public Intern(double baseSalary) {
        super(baseSalary);
    }

    @Override
    public double calculateSalary() {
        return baseSalary * 0.5;
    }

    @Override
    public double calculateSalary(boolean withBonus) {
        return withBonus ? calculateSalary() * 1.05 : calculateSalary();
    }
}