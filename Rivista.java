package Java.esModellazioneRiviste;

import java.util.*;

public class Rivista {
    private String nome;
    private double prezzo;
    private String materia;
    private String periodicita;
    private int numero;
    private String meseUscita;
    private String dataDiUscita;
    public List<Abbonamento> abbonamenti;
    
    //Metodo costruttore
    public Rivista(String nome, double prezzo, String materia, String periodicita, int numero, String meseUscita, String dataDiUscita){
        this.nome = nome;
        this.prezzo = prezzo;
        this.materia = materia;
        this.periodicita = periodicita;
        this.numero = numero;
        this.meseUscita = meseUscita;
        this.dataDiUscita = dataDiUscita;
        this.abbonamenti = new ArrayList<>();
    }

    //Metodi setter
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }
    public void setMateria(String materia) {
        this.materia = materia;
    }
    public void setPeriodicita(String periodicita) {
        this.periodicita = periodicita;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public void setMeseUscita(String meseUscita) {
        this.meseUscita = meseUscita;
    }
    public void setDataDiUscita(String dataDiUscita) {
        this.dataDiUscita = dataDiUscita;
    }

    //Metodi getter
    public String getNome() {
        return nome;
    }
    public double getPrezzo() {
        return prezzo;
    }
    public String getMateria() {
        return materia;
    }
    public String getPeriodicita() {
        return periodicita;
    }
    public int getNumero() {
        return numero;
    }
    public String getMeseUscita() {
        return meseUscita;
    }
    public String getDataDiUscita() {
        return dataDiUscita;
    }
}
