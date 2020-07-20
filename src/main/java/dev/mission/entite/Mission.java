package dev.mission.entite;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mission")
public class Mission {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "libelle")
	private String libelle;
	
	@Column(name = "date_debut")
	private LocalDate dateDebut;
	
	@Column(name = "date_fin")
	private LocalDate dateFin;
	
	@Column(name = "taux_journalier")
	private BigDecimal tauxJournalier;
	
	
	
	

	/** Constructeur
	 * 
	 */
	public Mission() {
		super();
	}

	/** Constructeur
	 * @param id
	 * @param libelle
	 * @param dateDebut
	 * @param dateFin
	 * @param tauxJournalier
	 */
	public Mission(String libelle, LocalDate dateDebut, LocalDate dateFin, BigDecimal tauxJournalier) {
		super();
		this.libelle = libelle;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.tauxJournalier = tauxJournalier;
	}

	@Override
	public String toString() {
		return "Mission libelle = " + libelle + " dateDebut = " + dateDebut + " dateFin = " + dateFin + " tauxJournalier = "
				+ tauxJournalier;
	}

	/** Getter
	 * @return id
	 */
	public Integer getId() {
		return id;
	}

	/** Setter
	 * @param id id
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/** Getter
	 * @return libelle
	 */
	public String getLibelle() {
		return libelle;
	}

	/** Setter
	 * @param libelle libelle
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	/** Getter
	 * @return dateDebut
	 */
	public LocalDate getDateDebut() {
		return dateDebut;
	}

	/** Setter
	 * @param dateDebut dateDebut
	 */
	public void setDateDebut(LocalDate dateDebut) {
		this.dateDebut = dateDebut;
	}

	/** Getter
	 * @return dateFin
	 */
	public LocalDate getDateFin() {
		return dateFin;
	}

	/** Setter
	 * @param dateFin dateFin
	 */
	public void setDateFin(LocalDate dateFin) {
		this.dateFin = dateFin;
	}

	/** Getter
	 * @return tauxJournalier
	 */
	public BigDecimal getTauxJournalier() {
		return tauxJournalier;
	}

	/** Setter
	 * @param tauxJournalier tauxJournalier
	 */
	public void setTauxJournalier(BigDecimal tauxJournalier) {
		this.tauxJournalier = tauxJournalier;
	}

	
}