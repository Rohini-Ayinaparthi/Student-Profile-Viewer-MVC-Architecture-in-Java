// Model/Student.java
package Model;
public class Student {
    private int id;
    private String name;
    private String course;

    public Student(int id, String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }
    public int getId() { return id; }
    public String getName() { return name; }
    public String getCourse() { return course; }
}
