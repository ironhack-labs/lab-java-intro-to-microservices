package Week6.grades_data_service.Service;

import Week6.grades_data_service.Model.Course;
import Week6.grades_data_service.Model.Grade;
import Week6.grades_data_service.Repository.CourseRepository;
import Week6.grades_data_service.Repository.GradeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private GradeRepository gradeRepository;

    public List<Grade> getGradesByCourse(String courseCode) {
        return null;
    }

    public Course getCourseByCode(String courseCode) {
        return courseRepository.findById(courseCode).orElse(null);
    }
}
