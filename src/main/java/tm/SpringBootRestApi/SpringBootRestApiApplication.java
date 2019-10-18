package tm.SpringBootRestApi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import tm.SpringBootRestApi.entities.Organization;
import tm.SpringBootRestApi.entities.Student;
import tm.SpringBootRestApi.repositories.OrganizationRepository;
import tm.SpringBootRestApi.repositories.StudentRepository;

@SpringBootApplication
public class SpringBootRestApiApplication {
	@Autowired
	private StudentRepository studentRepository;

	@Autowired
	private OrganizationRepository organizationRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestApiApplication.class, args);
		System.out.println("HardWork");
	}

	@Bean
	CommandLineRunner runner() {

		return args -> {

			Organization organization1 = new Organization("Mallareddy University", "JNTUniversity");

			Organization organization2 = new Organization("Karnatak University", "Karnatak University");

			organizationRepository.save(organization1);

			organizationRepository.save(organization2);

			studentRepository.save(new Student("Srinivas", "Male", "BE", 25, organization2));

			studentRepository.save(new Student("Sushma", "Female", "BE", 20, organization1));

			studentRepository.save(new Student("Sahithi", "Female", "BTech", 21, organization1));

			studentRepository.save(new Student("Sai Ganesh", "Male", "MCA", 26, organization2));

		};

	}

}
