package dev.mission.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import dev.mission.entite.Mission;

/**
 * @author Khalil HIMET
 *
 */
public interface MissionRepository extends JpaRepository<Mission, Integer> {
	
	@Query("select m from Mission m where m.dateDebut >= now()")
	List<Mission> listerProchainesMissions();
	
	@Query("select m from Mission m where m.dateDebut >= now() and m.tauxJournalier > ?1")
	List<Mission> listerProchainesMissionsJTM(BigDecimal taux);

}
