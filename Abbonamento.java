package Java.esModellazioneRiviste;

import java.util.ArrayList;
import java.util.List;

public class Abbonamento {

    private double prezzo;
    private String periodicita;
    private int meseInizio;
    private int annoInizio;
    private int meseScadenza;
    private int annoScadenza;
    public List<Abbonato> abbonati;

    //Metodo costruttore
    public Abbonamento(double prezzo, String periodicita, int meseInizio, int annoInizio, int meseScadenza, int annoScadenza){
        this.prezzo = prezzo;
        this.periodicita = periodicita;
        this.meseInizio = meseInizio;
        this.annoInizio = annoInizio;
        this.meseScadenza = meseScadenza;
        this.annoScadenza = annoScadenza;
        this.abbonati = new ArrayList<>();
    }

    //Metodi getter
    public double getPrezzo() {
        return prezzo;
    }
    public String getPeriodicita() {
        return periodicita;
    }
    public int getMeseInizio() {
        return meseInizio;
    }
    public int getAnnoInizio() {
        return annoInizio;
    }
    public int getMeseScadenza() {
        return meseScadenza;
    }
    public int getAnnoScadenza() {
        return annoScadenza;
    }

    //Metodi setter
    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }
    public void setPeriodicita(String periodicita) {
        this.periodicita = periodicita;
    }
    public void setMeseInizio(int meseInizio) {
        this.meseInizio = meseInizio;
    }
    public void setAnnoInizio(int annoInizio) {
        this.annoInizio = annoInizio;
    }
    public void setMeseScadenza(int meseScadenza) {
        this.meseScadenza = meseScadenza;
    }
    public void setAnnoScadenza(int annoScadenza) {
        this.annoScadenza = annoScadenza;
    }
}
