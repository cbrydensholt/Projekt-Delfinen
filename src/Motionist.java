public class Motionist {

    private static int count = 1;

    private int age;
    private String navn;
    private int id;
    private boolean aktiv;
    private boolean restance; // Kan ændres til automatisk med date

    public Motionist(int age, String navn, boolean aktiv, boolean restance) {
        this.age = age;
        this.navn = navn;
        this.id = count++; // To-do: Auto genereret ID
        this.aktiv = aktiv;
        this.restance = restance;
    }




    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getNavn() {
        return navn;
    }
    public void setNavn(String navn) {
        this.navn = navn;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public boolean isAktiv() {
        return aktiv;
    }
    public void setAktiv(boolean aktiv) {
        this.aktiv = aktiv;
    }

    public boolean isRestance() {
        return restance;
    }
    public void setRestance(boolean restance) {
        this.restance = restance;
    }
}