package Java.esModellazioneRiviste;

public class CasaEditrice {
    private int nome;
    private int annoCreazione;
    private String IBAN;
    
    public CasaEditrice(int nome, int annoCreazione, String IBAN){
        this.nome = nome;
        this.annoCreazione = annoCreazione;
        this.IBAN = IBAN;
    }

    //Metodi getter
    public int getNome(){
        return nome;
    }
    public int getAnnoCreazione(){
        return annoCreazione;
    }
    public String getIBAN(){
        return IBAN;
    }

    //Metodi setter
    public void setNome(int nome){
        this.nome = nome;
    }
    public void setAnnoCreazione(int annoCreazione){
        this.annoCreazione = annoCreazione;
    }
    public void setIBAN(String IBAN){
        this.IBAN = IBAN;
    }
}
