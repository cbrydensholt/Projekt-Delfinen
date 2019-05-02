public class PrisUdregner {

    private final int pensionsAlder = 60;
    private final int voksenAlder = 18;
    private final double voksenPris = 1600;
    private final double børnePris = 1000;
    private final double passivPris = 500;

    // Pris udregner for alm medlem + pensionist
    public double getPris(boolean aktiv, int age) {
        if (!aktiv) {
            // Passiv medlemskab kr. 500 ,-
            return passivPris;

        } else if (age >= pensionsAlder) {
            // Pensionist
            // Over 60 giver 25% rabat af 1600
            return voksenPris * 0.75;

        } else if (age >= voksenAlder) {
            // Voksen
            // Over 18. 1600,- Årligt
            return voksenPris;

        } else {
            // Barn
            // Under 18. 1000,- årligt
            return børnePris;
        }
    }
}