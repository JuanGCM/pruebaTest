package triana.salesianos.edu.BIODAM;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BiodamApplication {

	public static void main(String[] args) {
		SpringApplication.run(BiodamApplication.class, args);
	}

	@Bean
	public CommandLineRunner testDB(){
		return args -> {};
	}
}
