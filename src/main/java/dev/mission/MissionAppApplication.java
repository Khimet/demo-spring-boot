package dev.mission;

import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MissionAppApplication {

	public static void main(String[] args) {
		
		// Récupération du contexte Spring crée par Spring Boot
		// La classe de configuration initiale de Spring est MissionAppApplication
		try (ConfigurableApplicationContext context = SpringApplication.run(MissionAppApplication.class, args)){
			
			
//			//Récupération d'un bean de type Runnable
//			Map<String, Runnable> exec = context.getBeansOfType(Runnable.class);
//			
//			//éxécution
//			exec.forEach((s, r) -> r.run());
		}
		
		
		
	}

}
