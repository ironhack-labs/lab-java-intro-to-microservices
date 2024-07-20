package studentcatalogservice.controllers;

import com.example.studentcatalogservice.models.Catalog;
import com.example.studentcatalogservice.models.Grade;
import com.example.studentcatalogservice.models.Student;
import com.example.studentcatalogservice.models.StudentGrade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/catalog")
public class CatalogController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{courseCode}")
    public Catalog getCatalogByCourseCode(@PathVariable String courseCode) {
        Course course = restTemplate.getForObject("http://grades-data-service/courses/" + courseCode, Course.class);
        List<Grade> grades = restTemplate.getForObject("http://grades-data-service/courses/" + courseCode + "/grades", List.class);

        List<StudentGrade> studentGrades = new ArrayList<>().reversed();
        for (Grade grade : grades) {
            Student student = restTemplate.getForObject("http://student-info-service/students/" + grade.getStudentId(), Student.class);
            StudentGrade studentGrade = new StudentGrade();
            studentGrade.setStudentName(student.getName());
            studentGrade.setStudentAge(student.getAge());
            studentGrade.setGrade(grade.getGrade());
            studentGrades.add(studentGrade);
        }

        Catalog catalog = new Catalog();
        catalog.setCourseName(course.getCourseName());
        catalog.setStudentGrades(studentGrades);
        return catalog;
    }
}
