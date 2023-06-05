package com.epicode.GestionePrenotazioni.Repository;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.epicode.GestionePrenotazioni.model.Postazione;
import com.epicode.GestionePrenotazioni.model.TipoPostazione;
@Repository
public interface PostazioneRepository extends JpaRepository<Postazione, Long> {
	
	 @Query("SELECT post FROM Postazione post WHERE post.edificio.citta = :citta AND post.tipo = :tipo")
	    public Page<Postazione> findByTipoAndCitta(TipoPostazione tipo, Citta citta, Pageable pageable);

}
