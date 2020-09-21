package za.ac.cput.controller.previousQualification;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.entity.previousQualification.Qualification;
import za.ac.cput.factory.previousQualification.QualificationFactory;
import za.ac.cput.service.previousQualification.impl.QualificationServiceImpl;

import java.util.Set;

@RestController
@RequestMapping("/qualification")
public class QualificationController {

    @Autowired
    private QualificationServiceImpl qualificationService;

    @PostMapping("/create")
    public Qualification create(@RequestBody Qualification qualification)
    {
        Qualification newQualification = QualificationFactory.createQualification(qualification.getLevelOfQualifications());
        return qualificationService.create(newQualification);
    }

    @GetMapping("/all")
    public Set<Qualification> getAll()
    {
        return qualificationService.getAll();
    }
}
