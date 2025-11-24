package Task3.java;

public class Student extends Person implements Evaluatable {
    private int[] grades;

    public Student(String name, int age, int[] grades){
        super(name, age);
        this.grades = grades;
    }

    @Override
    public double evaluate() {
        int sum = 0;
        for(int i : grades) sum += i;
        return (double)sum / grades.length;
    }
    @Override
    public String describe() {
        return getName() + " (student), age: " + getAge();
    }
}
