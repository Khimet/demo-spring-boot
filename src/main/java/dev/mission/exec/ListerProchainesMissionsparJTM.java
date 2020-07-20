package dev.mission.exec;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;

import dev.mission.entite.Mission;
import dev.mission.repository.MissionRepository;

/**
 * @author Khalil HIMET
 *
 */
@Controller
@Profile("listerJTM")
public class ListerProchainesMissionsparJTM implements CommandLineRunner {
	
	private MissionRepository missionRepository;

	/** Constructeur
	 * @param missionRepository
	 */
	public ListerProchainesMissionsparJTM(MissionRepository missionRepository) {
		super();
		this.missionRepository = missionRepository;
	}

	@Override
	public void run(String... args) throws Exception {
		List<Mission> missions = missionRepository.listerProchainesMissionsJTM(new BigDecimal(args[0]));
		for(Mission m : missions) {
			System.out.println(m);
		}
		
	}
	
	
	
	

}
