class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new SoftwareEngineer(5000000);
        employees[1] = new DataScientist(5000000);
        employees[2] = new Intern(5000000);

        System.out.println("Gaji tanpa bonus:");
        for (Employee emp : employees) {
            System.out.println(emp.getClass().getSimpleName() + ": " + emp.calculateSalary());
        }

        System.out.println("\nGaji dengan bonus:");
        for (Employee emp : employees) {
            System.out.println(emp.getClass().getSimpleName() + ": " + emp.calculateSalary(true));
        }
    }
}