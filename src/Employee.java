public class Employee {
    private String firstName;
    private String lastName;

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String info() {
        return "Имя: " + firstName + ", фамилия: " + lastName;
    }

    public double getSalary(){

        return 0;
    }
}


