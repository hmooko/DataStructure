import java.util.List;

public class Student {
    private String name;
    private int studentId;
    private List<Course> enrolledCourses; 

    public Student(String name, int studentId, List<Course> enrolledCourses) {
        this.name = name;
        this.studentId = studentId;
        this.enrolledCourses = enrolledCourses;
    }

    public List<Course> getCourses() {
        return enrolledCourses;
    }

    @Override
    public String toString() {
        return name + "(" + studentId + ")";
    }
}