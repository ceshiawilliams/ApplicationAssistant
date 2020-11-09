package za.ac.cput.controller.user;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.*;
import org.springframework.test.context.junit4.SpringRunner;
import za.ac.cput.entity.previousQualification.Subject;
import za.ac.cput.entity.user.PersonalDetail;
import za.ac.cput.factory.previousQualification.SubjectFactory;
import za.ac.cput.factory.user.PersonalDetailFactory;

import static org.junit.Assert.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PersonalDetailControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL = "http://localhost:8080/personalDetail/";

    private static PersonalDetail personalDetail = PersonalDetailFactory.createPersonalDetails("cw21@gmail.com", "0215984", "Matric");
    private static String SECURITY_USERNAME = "Abdullah";
    private static String SECURITY_PASSWORD = "password";

    @Test
    public void a_create() {
        String url = baseURL + "create";
        System.out.println("URL" + url);
        System.out.println("Post data" + personalDetail);

        ResponseEntity<PersonalDetail> postResponse = restTemplate
                .withBasicAuth(SECURITY_USERNAME, SECURITY_PASSWORD)
                .postForEntity(url, personalDetail, PersonalDetail.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());

        personalDetail = postResponse.getBody();
        //assertEquals(HttpStatus.OK, postResponse.getStatusCode());
        assertEquals(personalDetail.getPersonalId(), postResponse.getBody().getPersonalId());

    }

    @Test
    public void d_getAll() {

        String url = baseURL + "all";
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<>(null, headers);
        ResponseEntity<String> response = restTemplate
                .withBasicAuth(SECURITY_USERNAME, SECURITY_PASSWORD)
                .exchange(url, HttpMethod.GET, entity, String.class);
        System.out.println(response);
        System.out.println(response.getBody());
    }

    @Test
    public void b_read() {
        String url = baseURL + "read/" + personalDetail.getPersonalId();
        System.out.println("URL" + url);

        ResponseEntity<PersonalDetail> response = restTemplate
                .withBasicAuth(SECURITY_USERNAME, SECURITY_PASSWORD)
                .getForEntity(url, PersonalDetail.class);
        assertEquals(personalDetail.getPersonalId(), response.getBody().getPersonalId());
        System.out.println(response.getBody());

    }

    @Test
    public void c_update() {
        PersonalDetail updated = new PersonalDetail.Builder().copy(personalDetail).setContactEmail("ceshw@gmail.com").build();
        String url = baseURL + "update";
        System.out.println("URL " + url);
        System.out.println("Post data: " + updated);
        ResponseEntity<PersonalDetail> response = restTemplate
                .withBasicAuth(SECURITY_USERNAME, SECURITY_PASSWORD)
                .postForEntity(url, updated, PersonalDetail.class);
        assertEquals(personalDetail.getPersonalId(), response.getBody().getPersonalId());

    }

    @Test
    public void e_delete() {
        String url = baseURL + "delete/" + personalDetail.getPersonalId();
        System.out.println("URL " + url);
        restTemplate
                .withBasicAuth(SECURITY_USERNAME, SECURITY_PASSWORD)
                .delete(url);
    }
}
