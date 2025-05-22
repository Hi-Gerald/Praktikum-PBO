class SoftwareEngineer extends Employee {
    public SoftwareEngineer(double baseSalary) {
        super(baseSalary);
    }

    @Override
    public double calculateSalary() {
        return baseSalary * 1.2;
    }

    @Override
    public double calculateSalary(boolean withBonus) {
        return withBonus ? calculateSalary() * 1.15 : calculateSalary();
    }
}