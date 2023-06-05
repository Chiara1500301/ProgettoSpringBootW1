package com.epicode.GestionePrenotazioni.Dto;
import java.time.LocalDate;

public class PrenotazioneDto {
    private Long id;
    private LocalDate dataPrenotata;
    private PostazioneDto postazione;
    private UtenteDto utente;

    public PrenotazioneDto() {
    }

    public PrenotazioneDto(Long id, LocalDate dataPrenotata, PostazioneDto postazione, UtenteDto utente) {
        this.id = id;
        this.dataPrenotata = dataPrenotata;
        this.postazione = postazione;
        this.utente = utente;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDataPrenotata() {
        return dataPrenotata;
    }

    public void setDataPrenotata(LocalDate dataPrenotata) {
        this.dataPrenotata = dataPrenotata;
    }

    public PostazioneDto getPostazione() {
        return postazione;
    }

    public void setPostazione(PostazioneDto postazione) {
        this.postazione = postazione;
    }

    public UtenteDto getUtente() {
        return utente;
    }

    public void setUtente(UtenteDto utente) {
        this.utente = utente;
    }
}
