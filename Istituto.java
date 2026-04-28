package Java.esModellazioneRiviste;

import java.util.ArrayList;
import java.util.List;

public class Istituto {

    private String nome;
    private String indirizzo;
    private String localita;
    private int recapitoTelefonico;
    public List<Abbonamento> abbonamenti;
    public List<Rivista> riviste;
    
    //Metodo costruttore
    public Istituto(String nome, String indirizzo, String localita, int recapitoTelefonico, List<Abbonamento> abbonamenti, List<Rivista> riviste){
        this.nome = nome;
        this.indirizzo = indirizzo;
        this.localita = localita;
        this.recapitoTelefonico = recapitoTelefonico;
        this.abbonamenti = new ArrayList<>();
        this.riviste = new ArrayList<>();
    }

    public void abbonamentiInScadenza(int mese, int anno){

        System.out.println("Vengono stampati gli abbonamenti in scadenza nel mese e nell'anno inseriti");

        for(Abbonamento a : abbonamenti){
            if(a.getMeseScadenza() < mese){
                System.out.println("L'abbonamento " + a + " del mese " + a.getMeseInizio() + " e' in scadenza");
            }
        }
        for(Abbonamento a: abbonamenti){
            if(a.getAnnoScadenza() < anno){
                System.out.println("L'abbonamento " + a + " dell'anno " + a.getAnnoInizio() + " e' in scadenza");
            }
        }
    }


    //Metodi getter
    public String getNome() {
        return nome;
    }
    public String getIndirizzo() {
        return indirizzo;
    }
    public String getLocalita() {
        return localita;
    }
    public int getRecapitoTelefonico() {
        return recapitoTelefonico;
    }

    //Metodi setter
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }
    public void setLocalita(String localita) {
        this.localita = localita;
    }
    public void setRecapitoTelefonico(int recapitoTelefonico) {
        this.recapitoTelefonico = recapitoTelefonico;
    }  
}
