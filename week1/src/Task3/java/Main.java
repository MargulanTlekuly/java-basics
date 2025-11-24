package Task3.java;

public class Main {
    public static void main(String[] args) {
        Person[] people = {
                new Student("Madi", 20, new int[]{5,5,5}),
                new Student("Erasyl", 19, new int[]{4,5,4}),
                new Student("Ramazan", 20, new int[]{4,4,4}),
                new Student("Aldiar", 19, new int[]{5,4,5}),
                new Teacher("Shah Syed", 50,"FEE"),
                new Teacher("Aliya", 29, "Differential Equations"),
                new Teacher("Azamat", 35, "Networks"),
                new Teacher("Ziro", 32, "Ethical Hacking")
        };

        for (Person p : people) {
            System.out.println(p.describe());

            if(p instanceof Student) {
                Student s = (Student) p;
                double avg = s.evaluate();
                System.out.println("GPA: " + avg);

                if (avg >= 4.5)
                    System.out.println("-> Excellent student!");
            }
            System.out.println("-------------------");
        }
    };
}