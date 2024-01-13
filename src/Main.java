import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main{
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        //      ArrayList<Student> students = new ArrayList<>();
 /*       ArrayList<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact("Армен Рафики Газарян", "+374 91 345 676"));
        contacts.add(new Contact("Смбат Гаикази Степанян", "+374 93 456 785 "));
        contacts.add(new Contact("Хаиказ Юри Ретросян", "+374 98 567 89 "));
        contacts.add(new Contact("Нораир Вардкеси Смбатян", "+374 94 678 900 "));
        contacts.add(new Contact("Каро Дживани Пилоян", "+374 95 789 007 "));
        for (Contact contact : contacts) {
            System.out.println(contact.info());*/

 /*       students.add(new Student("Армен Рафики Газарян", 20, 5));
        students.add(new Student("Смбат Гаикази Степанян", 21, 4));
        students.add(new Student("Хаиказ Юри Ретросян", 22, 3));
        students.add(new Student("Нораир Вардкеси Смбатян", 23, 2));
        students.add(new Student("Каро Дживани Пилоян", 24, 1));


        Student studentWithMaxGrade = Collections.max(students, (s1, s2) -> Integer.compare(s1.getGrade(), s2.getGrade()));

        System.out.println("Студент с максимальной оценкой:");
        System.out.println(studentWithMaxGrade);*/
        employees.add(new PartTimeEmployee("Армен", "Газарян", 1000, 100));
        employees.add(new PartTimeEmployee("Смбат", "Степанян", 2000, 200));
        employees.add(new FullTimeEmployee("Хаиказ", "Ретросян", 10000));
        employees.add(new FullTimeEmployee("Нораир", "Смбатян", 20000));
        employees.add(new FullTimeEmployee("Каро", "Пилоян", 30000));

        double totalSalary = 0;
        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
        }

        System.out.println(totalSalary);
    }
}



