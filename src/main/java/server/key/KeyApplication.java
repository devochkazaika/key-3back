package server.key;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan
public class KeyApplication {

	public static void main(String[] args) {
		SpringApplication.run(KeyApplication.class, args);
	}

}
