package co.vinod.springbootdemo;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringbootDemoApplication {

	@GetMapping(path = "/api/hello", produces = "text/plain")
	public String hello() {
		return "Hello, world!";
	}
	
	@GetMapping(path = "/api/hello", produces = "application/json")
	public Map<String, String> helloJson() {
		Map<String, String> m = new LinkedHashMap<>();
		m.put("message", "Hello, World!");
		m.put("from", "Vinod Kumar");
		return m;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDemoApplication.class, args);
	}

}
