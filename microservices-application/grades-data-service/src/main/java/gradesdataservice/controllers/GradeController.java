package gradesdataservice.controllers;

import com.example.gradesdataservice.models.Grade;
import com.example.gradesdataservice.repositories.GradeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/grades")
public class GradeController {
    @Autowired
    private GradeRepository repository;

    @GetMapping
    public List<Grade> getAllGrades() {
        return repository.findAll();
    }
}
