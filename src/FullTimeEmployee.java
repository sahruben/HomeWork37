public class FullTimeEmployee extends Employee{
    private double salary;
    public FullTimeEmployee(String firstName, String lastName, double salary)

    {
        super(firstName, lastName);
        this.salary = salary;
    }

    public double getSalary()

    {
        return salary * 0.7;
    }

}
