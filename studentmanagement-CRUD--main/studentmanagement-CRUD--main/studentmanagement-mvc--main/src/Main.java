// Main.java
import Controller.StudentController;
import Model.Student;
import View.StudentView;

public class Main {
    public static void main(String[] args) {
        Student model = new Student(77, "Vaishu", "GNT");
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);
        controller.displayStudent();
    }
}
