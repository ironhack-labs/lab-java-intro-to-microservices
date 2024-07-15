package Week6.grades_data_service.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Grade {

    @Id

    private int id;
    private String studentId;
    private Double grade;

    public Grade() {}

    public Grade(int id, String studentId, Double grade) {
        this.id = id;
        this.studentId = studentId;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public Double getGrade() {
        return grade;
    }

    public void setGrade(Double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "id=" + id +
                ", studentId='" + studentId + '\'' +
                ", grade=" + grade +
                '}';
    }
}
