class Employee extends Person {
    private double salary;
    
    public Employee(String n, int a, double s) {
        super(n, a);  // memanggil constructor parent yaitu person untuk menginisiasikan name dan age
        salary = s;
    }
    
    public void showSalary() {
        System.out.println("Salary: " + salary);
    }
    
    // menampilkan metode untuk menampilkan employee karena di main ada emp.displayAll()
    public void displayAll() {
        display();
        showSalary();
    }
}

//Perubahan yang dilakukan adalah memanggil constructor parent yaitu person untuk menginisiasikan name dan age
//dan membuat metode untuk menampilkan employee