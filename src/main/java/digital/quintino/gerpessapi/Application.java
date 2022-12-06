package digital.quintino.gerpessapi;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Value("${server.port}")
	private String numeroPorta;

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(Application.class);
	        application.setBannerMode(Banner.Mode.OFF);
	        application.run(args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Projeto: Sistema de Gestão de Pessoas (GERPESSAPI)");
		System.out.println("Plataforma: API");
		System.out.println("Versão: v1.0.0");
		System.out.println("Porta: " + numeroPorta);
	}

}
