package com.epicode.GestionePrenotazioni.Controller;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.epicode.GestionePrenotazioni.Repository.PrenotazioneRepository;
import com.epicode.GestionePrenotazioni.model.Prenotazione;

@Service
public class PrenotazioneService {

    private final PrenotazioneRepository prenotazioneRepository;

    // Iniezione tramite costruttore o annotazione @Autowired

    public PrenotazioneService(PrenotazioneRepository prenotazioneRepository) {
        this.prenotazioneRepository = prenotazioneRepository;
    }

    // Altri metodi del service...

    public Page<Prenotazione> getAllPrenotazioni(Pageable pageable) {
        return prenotazioneRepository.findAll(pageable);
    }

    public Prenotazione getPrenotazioneById(Long id) {
        return prenotazioneRepository.findById(id).orElse(null);
    }

	public Prenotazione createPrenotazione(Prenotazione prenotazione) {
		// TODO Auto-generated method stub
		return null;
	}
}
