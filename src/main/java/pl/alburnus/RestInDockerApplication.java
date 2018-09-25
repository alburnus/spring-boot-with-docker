package pl.alburnus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class RestInDockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestInDockerApplication.class, args);
	}

	@GetMapping(path = "/api/hello")
	public String getHello() {
		return "Hello Docker";
	}
}
