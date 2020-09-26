package za.ac.cput.controller.tertiaryInstitution;

import org.springframework.web.bind.annotation.*;
import za.ac.cput.entity.tertiaryInstitution.Course;

@RestController
@RequestMapping("/race")

public class CourseController {

    @PostMapping("/create")
    public Course create(@RequestBody Course course) {
        return course;
    }
}
