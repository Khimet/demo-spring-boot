package dev.mission.exec;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
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
@Profile("insert")
public class InsererMission implements Runnable {
	
	private MissionRepository missionRepository;

	/** Constructeur
	 * @param missionRepository
	 */
	public InsererMission(MissionRepository missionRepository) {
		super();
		this.missionRepository = missionRepository;
	}

	@Override
	public void run() {
		
		Mission mission = new Mission();
		mission.setLibelle("Mission 1");
		mission.setTauxJournalier(new BigDecimal("100.90"));
		mission.setDateDebut(LocalDate.of(2019, 1, 1));
		mission.setDateFin(LocalDate.of(2013, 3, 4));
		
		Mission mission2 = new Mission();
		mission2.setLibelle("Mission 2");
		mission2.setTauxJournalier(new BigDecimal("150.30"));
		mission2.setDateDebut(LocalDate.of(2020, 1, 1));
		mission2.setDateFin(LocalDate.of(2020, 3, 4));
		
		Mission mission3 = new Mission();
		mission3.setLibelle("Mission 3");
		mission3.setTauxJournalier(new BigDecimal("90.8"));
		mission3.setDateDebut(LocalDate.of(2020, 8, 1));
		mission3.setDateFin(LocalDate.of(2020, 9, 4));
		
		List<Mission> missions = new ArrayList<>(Arrays.asList(mission, mission2, mission3));
		
		missions.forEach(m -> this.missionRepository.save(m));
		
//		this.missionRepository.save(mission);
		
	}
	
	
	
	

}
