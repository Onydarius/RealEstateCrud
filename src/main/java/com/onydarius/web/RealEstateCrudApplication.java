package com.onydarius.web;

		import org.springframework.boot.SpringApplication;
		import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class RealEstateCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(RealEstateCrudApplication.class, args);
	}


	/*
	@Autowired
	private IClientRepository repository;

	@Override
	implements CommandLineRunner
	public void run(String... args) throws Exception {
		Client client1 = new Client("Jesus Ricardo", "Rubio", "Villalobos", "Av Lazaro Cardenas #124", "Colonia Centro","Pátzcuaro", "Michoacan", "61600", "Na", "Estudiante",
				"Onydarius@hotmail.com","Tijuana B.C.", LocalDate.of(1999, Month.JANUARY, 17), "Soltero", "Na" );

		repository.save(client1);
		repository.save(client1);
		repository.save(client1);

	}*/
}