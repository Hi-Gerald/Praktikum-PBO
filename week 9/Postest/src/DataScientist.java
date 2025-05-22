class DataScientist extends Employee {
    public DataScientist(double baseSalary) {
        super(baseSalary);
    }

    @Override
    public double calculateSalary() {
        return baseSalary * 1.15;
    }

    @Override
    public double calculateSalary(boolean withBonus) {
        return withBonus ? calculateSalary() * 1.12 : calculateSalary();
    }
}