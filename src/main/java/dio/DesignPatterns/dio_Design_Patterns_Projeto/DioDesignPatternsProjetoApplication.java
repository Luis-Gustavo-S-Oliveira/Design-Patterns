package dio.DesignPatterns.dio_Design_Patterns_Projeto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class DioDesignPatternsProjetoApplication {

	public static void main(String[] args) {
		SpringApplication.run( DioDesignPatternsProjetoApplication.class, args);
	}
}
