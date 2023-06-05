package com.epicode.GestionePrenotazioni.Dto;

import com.epicode.GestionePrenotazioni.model.TipoPostazione;

public class PostazioneDto {
    private String codice;
    private String descrizione;
    private TipoPostazione tipo;
    private int numeroMassimoOccupanti;

    public PostazioneDto() {
    }

    public PostazioneDto(String codice, String descrizione, TipoPostazione tipo, int numeroMassimoOccupanti) {
        this.codice = codice;
        this.descrizione = descrizione;
        this.tipo = tipo;
        this.numeroMassimoOccupanti = numeroMassimoOccupanti;
    }

    public String getCodice() {
        return codice;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public TipoPostazione getTipo() {
        return tipo;
    }

    public void setTipo(TipoPostazione tipo) {
        this.tipo = tipo;
    }

    public int getNumeroMassimoOccupanti() {
        return numeroMassimoOccupanti;
    }

    public void setNumeroMassimoOccupanti(int numeroMassimoOccupanti) {
        this.numeroMassimoOccupanti = numeroMassimoOccupanti;
    }
}
