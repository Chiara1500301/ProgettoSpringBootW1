package com.epicode.GestionePrenotazioni.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.epicode.GestionePrenotazioni.model.Utente;

import net.bytebuddy.dynamic.DynamicType.Builder.RecordComponentDefinition.Optional;

@Repository
public interface UtenteRepository extends JpaRepository<Utente, Long> {

    Optional<Utente> findByUsername(String username);

    Optional<Utente> findByEmail(String email);
}
