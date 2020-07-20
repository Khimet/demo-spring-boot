package dev.mission.exec;

import java.time.LocalDate;
import java.util.List;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;

import dev.mission.entite.Mission;
import dev.mission.repository.MissionRepository;

/**
 * @author Khalil HIMET
 *
 */
@Controller
public class ListerProchainesMissions implements Runnable {
	
	private MissionRepository missionRepository;

	/** Constructeur
	 * @param missionRepository
	 */
	public ListerProchainesMissions(MissionRepository missionRepository) {
		super();
		this.missionRepository = missionRepository;
	}

	@Override
	public void run() {
		
		List<Mission> resultats = missionRepository.listerProchainesMissions();
		
		if (!resultats.isEmpty()) {
			
			resultats.forEach(System.out::println);
		}
		
	}
	
	
	
	
	
	

}
