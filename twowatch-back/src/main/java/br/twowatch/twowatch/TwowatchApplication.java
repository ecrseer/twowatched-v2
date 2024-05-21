package br.twowatch.twowatch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class TwowatchApplication {

	public static void main(String[] args) {
		SpringApplication.run(TwowatchApplication.class, args);
	}

}
