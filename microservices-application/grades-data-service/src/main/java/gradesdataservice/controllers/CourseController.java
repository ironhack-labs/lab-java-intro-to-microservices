package gradesdataservice.controllers;

import com.example.gradesdataservice.models.Course;
import com.example.gradesdataservice.models.Grade;
import com.example.gradesdataservice.repositories.CourseRepository;
import com.example.gradesdataservice.repositories.GradeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {
    @Autowired
    private CourseRepository repository;
    @Autowired
    private GradeRepository gradeRepository;

    @GetMapping("/{courseCode}")
    public Course getCourseByCourseCode(@PathVariable String courseCode) {
        return repository.findByCourseCode(courseCode);
    }

    @GetMapping("/{courseCode}/grades")
    public List<Grade> getGradesByCourseCode(@PathVariable String courseCode) {
        return gradeRepository.findByCourseCode(courseCode);
    }
}
