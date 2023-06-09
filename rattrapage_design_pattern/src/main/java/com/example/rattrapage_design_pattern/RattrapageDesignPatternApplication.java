package com.example.rattrapage_design_pattern;

import com.example.rattrapage_design_pattern.entity.Classe;
import com.example.rattrapage_design_pattern.repositories.ClasseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RattrapageDesignPatternApplication implements CommandLineRunner {
	@Autowired
	private ClasseRepository classeRepository;
	public static void main(String[] args) {
		SpringApplication.run(RattrapageDesignPatternApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		for (int i = 1; i < 5; i++) {
			Classe cl=new Classe();
			cl.setLibelle("GLRS-"+i);

			classeRepository.save(cl);

		}
	}
}
