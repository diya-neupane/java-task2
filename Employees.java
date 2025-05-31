public class Employees {
    // Private instance variables
    private String name;
    private String employeeId;
    private double salary;

    // Constructor
    public Employees(String name, String employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        if (salary >= 0) {
            this.salary = salary;
        } else {
            this.salary = 0;
        }
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for employee ID
    public String getEmployeeId() {
        return employeeId;
    }

    // Setter for employee ID
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    // Getter for salary
    public double getSalary() {
        return salary;
    }

    // Method to update salary (increase or decrease)
    public void updateSalary(double amount) {
        if (salary + amount >= 0) {
            salary += amount;
        } else {
            System.out.println("Error: Salary cannot be negative.");
        }
    }

    // Display employee info
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: $" + salary);
    }
}
