public class Student implements Comparable<Student> {
protected String name;
protected int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //Get/Set age
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    //Get/Set name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Student otherStudent) {
        return Integer.compare(this.getAge(), otherStudent.getAge());
    }

    @Override
    public java.lang.String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }
}
