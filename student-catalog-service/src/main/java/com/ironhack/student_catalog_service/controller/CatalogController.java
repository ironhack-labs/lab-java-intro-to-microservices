@RestController
@RequestMapping("/catalog")
public class CatalogController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/course/{courseCode}")
    public ResponseEntity<Catalog> getCatalogByCourseCode(@PathVariable String courseCode) {
        Course course = restTemplate.getForObject("http://grades-data-service/courses/" + courseCode, Course.class);
        List<Grade> grades = restTemplate.exchange("http://grades-data-service/courses/" + courseCode + "/grades",
                HttpMethod.GET, null, new ParameterizedTypeReference<List<Grade>>() {}).getBody();

        List<StudentGrade> studentGrades = grades.stream().map(grade -> {
            Student student = restTemplate.getForObject("http://student-info-service/students/" + grade.getStudentId(), Student.class);
            return new StudentGrade(student.getName(), student.getAge(), grade.getGrade());
        }).collect(Collectors.toList());

        Catalog catalog = new Catalog();
        catalog.setCourseName(course.getName());
        catalog.setStudentGrades(studentGrades);

        return ResponseEntity.ok(catalog);
    }
}
