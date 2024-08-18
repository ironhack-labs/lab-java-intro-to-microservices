package com.ironhack.microservicesgrades.model;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Grade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String grade;
    private Integer studentId;
    @Column(name = "course_code")
    private String courseCode;


    public Grade(Integer id, String grade, Integer studentId, String courseCode) {
        this.id = id;
        this.grade = grade;
        this.studentId = studentId;
        this.courseCode = courseCode;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "id=" + id +
                ", grade='" + grade + '\'' +
                ", studentId=" + studentId +
                ", courseCode='" + courseCode + '\'' +
                '}';
    }
}
