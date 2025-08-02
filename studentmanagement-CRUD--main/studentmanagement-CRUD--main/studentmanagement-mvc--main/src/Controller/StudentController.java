// Controller/StudentController.java
package Controller;
import Model.Student;
import View.StudentView;

public class StudentController {
    private Student model;
    private StudentView view;

    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    public void displayStudent() {
        view.printStudentDetails(model.getId(), model.getName(), model.getCourse());
    }
}
