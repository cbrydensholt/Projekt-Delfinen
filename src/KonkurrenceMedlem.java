public class KonkurrenceMedlem extends Motionist {

    // Speciellt fields for konkurrence svømmer
    private String swimType;
    private int swimTid;

    public KonkurrenceMedlem(int age, String navn, boolean aktiv, boolean betalt, String swimType, int swimTid) {
        super(age, navn, aktiv, betalt);
        this.swimType = swimType;
        this.swimTid = swimTid;
    }

    public String getSwimType() {
        return swimType;
    }
    public void setSwimType(String swimType) {
        this.swimType = swimType;
    }

    public int getSwimTid() {
        return swimTid;
    }
    public void setSwimTid(int swimTid) {
        this.swimTid = swimTid;
    }
}