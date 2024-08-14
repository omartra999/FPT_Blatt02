public class Autor {
    private String vorname;
    private  String nachname;
    private int alter;

    public Autor(String vorname, String nachname, int alter){
        this.alter = alter;
        this.nachname = nachname;
        this.vorname = vorname;
    }

    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public int getAlter() {
        return alter;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }
}
