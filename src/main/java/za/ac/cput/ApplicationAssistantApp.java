package za.ac.cput;

import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import za.ac.cput.util.SendHTMLEmail;

@SpringBootApplication
public class ApplicationAssistantApp {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationAssistantApp.class, args);
        //SendHTMLEmail.sendEmail("henry.keown@gmail.com");
    }
}


