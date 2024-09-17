import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        Machine1 m1 = new Machine1();
        Machine2 m2 = new Machine2();
        Machine3 m3 = new Machine3();
        Student s1 = new Student("Christian", 28);
        Student s2 = new Student("Johannes", 22);
        ArrayList<Student> students = new ArrayList<>();

        students.add(s1);
        students.add(s2);

            m1.start();
            m2.start();
            m3.start();

            m1.stop();
            m2.stop();
            m3.stop();

            m3.Kyl();

        int comparison = s1.compareTo(s2);

        //If statement that checks age gap (compareTo method) between students
        if (comparison < 0) {
            System.out.println(s1.getAge() + " is older than " + s2.getAge());
        } else if (comparison > 0) {
            System.out.println(s1.getAge() + " is greater than " + s2.getAge());
        }else {
            System.out.println(s1.getName() + " and " + s2.getName() + " are the same age.");
        }

        // Print out student information
        for(Student s : students) {
            System.out.println(s);
        }
    }
}
