package com.onydarius.web;

		import com.onydarius.web.controller.entity.Client;
		import com.onydarius.web.repository.IClientRepository;
		import org.springframework.beans.factory.annotation.Autowired;
		import org.springframework.boot.CommandLineRunner;
		import org.springframework.boot.SpringApplication;
		import org.springframework.boot.autoconfigure.SpringBootApplication;

		import java.time.LocalDate;
		import java.time.Month;
		import java.util.Date;

@SpringBootApplication
public class RealEstateCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(RealEstateCrudApplication.class, args);
	}

	@Autowired
	private IClientRepository repository;

	/*@Override
	implements CommandLineRunner
	public void run(String... args) throws Exception {
		Client client1 = new Client("Jesus Ricardo", "Rubio", "Villalobos", "Av Lazaro Cardenas #124", "Colonia Centro","Pátzcuaro", "Michoacan", "61600", "Na", "Estudiante",
				"Onydarius@hotmail.com","Tijuana B.C.", LocalDate.of(1999, Month.JANUARY, 17), "Soltero", "Na" );

		repository.save(client1);
		repository.save(client1);
		repository.save(client1);

	}*/
}