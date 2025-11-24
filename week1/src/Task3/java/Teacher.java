package Task3.java;

public class Teacher extends Person{

    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;

    }
    @Override
    public String describe(){
        return getName() + " (teacher), subject: " + subject;
    }

}
