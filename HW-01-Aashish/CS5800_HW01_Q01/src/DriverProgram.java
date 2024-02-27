// DriverProgram.java - Update to include BaseEmployee and correct data assignment
public class DriverProgram {
    public static void main(String[] args) {
        SalariedEmployee salariedEmployee = new SalariedEmployee("Joe", "Jones", "111-11-1111", 2500);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Stephanie", "Smith", "222-22-2222", 25, 32);
        HourlyEmployee hourlyEmployee2 = new HourlyEmployee("Mary", "Quinn", "333-33-3333", 19, 47);
        CommissionEmployee commissionEmployee = new CommissionEmployee("Nicole", "Dior", "444-44-4444", 0.15, 50000);
        SalariedEmployee salariedEmployee2 = new SalariedEmployee("Renwa", "Chanel", "555-55-5555", 1700);
        BaseEmployee baseEmployee = new BaseEmployee("Mike", "Davenport", "666-66-6666", 95000);
        CommissionEmployee commissionEmployee2 = new CommissionEmployee("Mahnaz", "Vaziri", "777-77-7777", 0.22, 40000);

        // Print details of each employee
        printEmployeeDetails(salariedEmployee);
        printEmployeeDetails(hourlyEmployee);
        printEmployeeDetails(hourlyEmployee2);
        printEmployeeDetails(commissionEmployee);
        printEmployeeDetails(salariedEmployee2);
        printEmployeeDetails(baseEmployee);
        printEmployeeDetails(commissionEmployee2);
    }

    // Updated method to include BaseEmployee
    private static void printEmployeeDetails(Employee employee) {
        System.out.println("Name: " + employee.getFirstName() + " " + employee.getLastName());
        System.out.println("Social Security Number: " + employee.getSocialSecurityNumber());
        if (employee instanceof SalariedEmployee) {
            SalariedEmployee se = (SalariedEmployee) employee;
            System.out.println("Weekly Salary: $" + se.getWeeklySalary());
        } else if (employee instanceof HourlyEmployee) {
            HourlyEmployee he = (HourlyEmployee) employee;
            System.out.println("Hourly Wage: $" + he.getWage() + ", Hours Worked: " + he.getHoursWorked());
        } else if (employee instanceof CommissionEmployee) {
            CommissionEmployee ce = (CommissionEmployee) employee;
            System.out.println("Commission Rate: " + ce.getCommissionRate() + ", Gross Salary: $" + ce.getGrossSalary());
        } else if (employee instanceof BaseEmployee) {
            BaseEmployee be = (BaseEmployee) employee;
            System.out.println("Base Salary: $" + be.getBaseSalary());
        }
        System.out.println("-------------------------------------------------");
    }
}