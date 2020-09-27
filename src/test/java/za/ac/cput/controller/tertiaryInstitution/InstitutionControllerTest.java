package za.ac.cput.controller.tertiaryInstitution;

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
import za.ac.cput.entity.tertiaryInstitution.Institution;
import za.ac.cput.factory.tertiaryInstitution.InstitutionFactory;

import static org.junit.Assert.*;
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class InstitutionControllerTest {

    private static Institution institution = InstitutionFactory.createInstitution("Cape Peninsula University of Technology", "CPUT");

    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL = "http://localhost:8080/institution/";

    @Test
    public void a_create() {
        String url = baseURL + "create";
        System.out.println("URL: " + url);

        ResponseEntity<Institution> postResponse = restTemplate.postForEntity(url, institution, Institution.class);

        institution = postResponse.getBody();
        System.out.println("Saved data: " + institution);
        assertEquals(institution.getInstitutionId(), postResponse.getBody().getInstitutionId());
    }

    @Test
    public void e_getAllStartingWith() {
        String url = baseURL + "allwith/" + "c";
        System.out.println("URL: " + url);

        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);
        System.out.println(response);
        System.out.println(response.getBody());
    }

    @Test
    public void b_read() {
        String url = baseURL + "read/" + institution.getInstitutionId();
        System.out.println("URL: " + url);

        ResponseEntity<Institution> response = restTemplate.getForEntity(url, Institution.class);

        System.out.println("Saved data: " + response.getBody());
        assertEquals(institution.getInstitutionId(), response.getBody().getInstitutionId());
    }

    @Test
    public void c_update() {
        Institution updated = new Institution.Builder().copy(institution).setInstitutionCode("CPUT6").build();
        String url = baseURL + "update";
        System.out.println("URL: " + url);
        System.out.println("Post data: " + updated);
        ResponseEntity<Institution> response = restTemplate.postForEntity(url, updated, Institution.class);
        assertEquals(institution.getInstitutionId(), response.getBody().getInstitutionId());
    }

    @Test
    public void d_getAll() {
        String url = baseURL + "all";
        System.out.println("URL: " + url);
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);
        System.out.println(response);
        System.out.println(response.getBody());
    }

    @Test
    public void f_delete() {
        String url = baseURL + "delete/" + institution.getInstitutionId();
        System.out.println("URL: " + url);
        restTemplate.delete(url);
    }
}