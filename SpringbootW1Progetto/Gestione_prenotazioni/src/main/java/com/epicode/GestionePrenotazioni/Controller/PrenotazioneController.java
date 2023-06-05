package com.epicode.GestionePrenotazioni.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import com.epicode.GestionePrenotazioni.model.Prenotazione;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@RestController
@RequestMapping("/prenotazioni")
@Validated
public class PrenotazioneController {

    private final PrenotazioneService prenotazioneService;

    @Autowired
    public PrenotazioneController(PrenotazioneService prenotazioneService) {
        this.prenotazioneService = prenotazioneService;
    }

    @GetMapping
    public ResponseEntity<Page<Prenotazione>> getAllPrenotazioni(Pageable pageable) {
        Page<Prenotazione> prenotazioni = prenotazioneService.getAllPrenotazioni(pageable);
        return ResponseEntity.ok(prenotazioni);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Prenotazione> getPrenotazioneById(@PathVariable @NotNull Long id) {
        Prenotazione prenotazione = prenotazioneService.getPrenotazioneById(id);
        if (prenotazione != null) {
            return ResponseEntity.ok(prenotazione);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // ...

    @PostMapping
    public ResponseEntity<Prenotazione> createPrenotazione(@Valid @RequestBody Prenotazione prenotazione) {
        Prenotazione nuovaPrenotazione = prenotazioneService.createPrenotazione(prenotazione);
        return ResponseEntity.status(HttpStatus.CREATED).body(nuovaPrenotazione);
    }

    // ...

}
