public class Stævne {
    private String navn;
    private String adresse;
    private int startTidspunkt;
    private Object[] konkurrent;

    public Stævne(String navn, String adresse, int startTidspunkt, Object[] konkurrent) {
        this.navn = navn;
        this.adresse = adresse;
        this.startTidspunkt = startTidspunkt;
        this.konkurrent = konkurrent;
    }


    public Object[] getKonkurrent() {
        return konkurrent;
    }
    public void setKonkurrent(Motionist deltager) {
        this.konkurrent = konkurrent;
    }

    public String getNavn() {
        return navn;
    }
    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getAdresse() {
        return adresse;
    }
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getStartTidspunkt() {
        return startTidspunkt;
    }
    public void setStartTidspunkt(int startTidspunkt) {
        this.startTidspunkt = startTidspunkt;
    }
}