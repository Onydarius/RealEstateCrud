package com.onydarius.web;

		import com.onydarius.web.controller.entity.Client;
		import com.onydarius.web.repository.IClientRepo;
		import org.springframework.beans.factory.annotation.Autowired;
		import org.springframework.boot.CommandLineRunner;
		import org.springframework.boot.SpringApplication;
		import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RealEstateCrudApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(RealEstateCrudApplication.class, args);
	}

	@Autowired
	private IClientRepo repository;

	@Override
	public void run(String... args) throws Exception {
		Client client1 = new Client("Jesus", "Rubio", "Villalobos");
		Client client2 = new Client("Zaira", "Escobar", "Moreno");
		Client client3 = new Client("Fernando", "Aparicio", "Ponce");

		repository.save(client1);
		repository.save(client2);
		repository.save(client3);

	}
}