package Tascom.DesafioTascomSpringCep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class DesafioTascomSpringCepApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesafioTascomSpringCepApplication.class, args);
	}

}
