public class Student {
    private String name;
    private

    int age;
    private

    int grade;

    public

    Student(String name, int age, int grade)

    {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Имя: " + name + ", возраст: " + age + ", оценка: " + grade;
    }
}
