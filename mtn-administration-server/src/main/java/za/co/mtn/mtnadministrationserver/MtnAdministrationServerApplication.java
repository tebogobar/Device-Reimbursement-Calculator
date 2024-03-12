package za.co.mtn.mtnadministrationserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@EnableAdminServer
@SpringBootApplication
public class MtnAdministrationServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MtnAdministrationServerApplication.class, args);
	}

}
