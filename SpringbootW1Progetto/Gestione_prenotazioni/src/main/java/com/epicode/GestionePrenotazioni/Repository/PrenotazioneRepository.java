package com.epicode.GestionePrenotazioni.Repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.epicode.GestionePrenotazioni.model.Postazione;
import com.epicode.GestionePrenotazioni.model.Prenotazione;
@Repository
public interface PrenotazioneRepository extends JpaRepository<Prenotazione, Long>  {
	 List<Prenotazione> findByUser(User user);

	    Page<Prenotazione> findByUserAndDataPrenotata(User user, LocalDate dataPrenotata, Pageable pageable);

	    List<Prenotazione> findByPostazioneAndDataPrenotata(Postazione postazione, LocalDate dataPrenotata);
}
