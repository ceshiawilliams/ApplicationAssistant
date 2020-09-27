package za.ac.cput.controller.previousQualification;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import za.ac.cput.entity.previousQualification.Qualification;
import za.ac.cput.entity.previousQualification.Subject;
import za.ac.cput.factory.previousQualification.QualificationFactory;
import za.ac.cput.factory.previousQualification.SubjectFactory;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class QualificationControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL = "http://localhost:8080/qualification/";

    private static Qualification qualification = QualificationFactory.createQualification("Grade 12");

    @Test
    public void a_create() {
        String url = baseURL + "create";
        System.out.println("URL: " + url);
        System.out.println("Post Data: " + qualification);

        ResponseEntity<Qualification> postResponse = restTemplate.postForEntity(url, qualification, Qualification.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());

        qualification = postResponse.getBody();
        System.out.println("Saved Data: " + qualification);
        assertEquals(qualification.getQualificationId(), postResponse.getBody().getQualificationId());
    }

    @Test
    public void d_getAll() {
        String url = baseURL + "all";
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);
        System.out.println(response);
        System.out.println(response.getBody());
    }

    @Test
    public void b_read() {
        String url = baseURL + "read/" + qualification.getQualificationId();
        System.out.println("URL: " + url);

        ResponseEntity<Qualification> response = restTemplate.getForEntity(url, Qualification.class);
        assertEquals(qualification.getQualificationId(), response.getBody().getQualificationId());
        System.out.println(response.getBody());
    }

    @Test
    public void c_update() {
        Subject subject = SubjectFactory.createSubject("Math", 80);
        Set<Subject> subjectList = new HashSet<>();
        subjectList.add(subject);
        Qualification updated = new Qualification.Builder().copy(qualification).setSubjectList(subjectList).build();
        String url = baseURL + "update";
        System.out.println("URL: " + url);
        System.out.println("Post Data: " + updated);
        ResponseEntity<Qualification> postResponse = restTemplate.postForEntity(url, updated, Qualification.class);
        assertEquals(qualification.getQualificationId(), postResponse.getBody().getQualificationId());
    }

    @Test
    public void e_delete() {
        String url = baseURL + "delete/" + qualification.getQualificationId();
        System.out.println("URL: " + url);
        restTemplate.delete(url);
    }
}