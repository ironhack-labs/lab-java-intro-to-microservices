package com.ironhack.microservice.Controller;



import com.ironhack.microservice.Model.Course;
import com.ironhack.microservice.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/{courseCode}")
    public ResponseEntity<Course> getCourse(@PathVariable String courseCode) {
        Course course = courseService.getCourseByCode(courseCode);
        return ResponseEntity.ok(course);
    }
}
