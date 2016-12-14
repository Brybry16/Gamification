package ch.heigvd.gamification;

import ch.heigvd.gamification.dao.Action;
import ch.heigvd.gamification.dao.Rule;
import ch.heigvd.gamification.repositories.RuleRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@ComponentScan(basePackages = "ch.heigvd.gamification")
public class Swagger2SpringBoot implements CommandLineRunner {

	@Override
	public void run(String... arg0) throws Exception {
		if (arg0.length > 0 && arg0[0].equals("exitcode")) {
			throw new ExitException();
		}
	}

	public static void main(String[] args) throws Exception {
		new SpringApplication(Swagger2SpringBoot.class).run(args);
	}

	@Bean
	public CommandLineRunner demo(RuleRepository repository) {
		return args -> {
            System.out.println("CREATE SAMPLE RULE");
			repository.save(new Rule("TEST", new Action("HELLO")));
			repository.findByEventType("TEST").forEach(System.out::println);
		};
	}

	class ExitException extends RuntimeException implements ExitCodeGenerator {
		private static final long serialVersionUID = 1L;

		@Override
		public int getExitCode() {
			return 10;
		}

	}
}