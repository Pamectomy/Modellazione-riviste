package Java.esModellazioneRiviste;

public class Abbonato {

    private String nome;
    private String cognome;
    private int eta;
    private String residenza;
    private int telefono;
    private String sesso;
    private String mail;
    
    //Metodo costruttore
    public Abbonato(String nome, String cognome, int eta, String residenza, int telefono, String sesso, String mail){
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        this.residenza = residenza;
        this.telefono = telefono;
        this.sesso = sesso;
        this.mail = mail;
    }

    //Metodi getter
    public String getNome() {
        return nome;
    }
    public String getCognome() {
        return cognome;
    }
    public int getEta() {
        return eta;
    }
    public String getResidenza() {
        return residenza;
    }
    public int getTelefono() {
        return telefono;
    }
    public String getSesso() {
        return sesso;
    }
    public String getMail() {
        return mail;
    }

    //Metodi setter
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
    public void setEta(int eta) {
        this.eta = eta;
    }
    public void setResidenza(String residenza) {
        this.residenza = residenza;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public void setSesso(String sesso) {
        this.sesso = sesso;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }
}
