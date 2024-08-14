public class Kapitel {
   private String ueberschrift;
   private Text text;
   private Kapitel nachfolger;

   public Kapitel(String ueberschrift, Text text, Kapitel nachfolger){
       this.text = text;
       this.ueberschrift = ueberschrift;
       this.nachfolger = nachfolger;
   }

    public Text getText() {
        return text;
    }

    public Kapitel getNachfolger() {
        return nachfolger;
    }

    public String getUeberschrift() {
        return ueberschrift;
    }

    public void setText(Text text) {
        this.text = text;
    }

    public void setNachfolger(Kapitel nachfolger) {
        this.nachfolger = nachfolger;
    }

    public void setUeberschrift(String ueberschrift) {
        this.ueberschrift = ueberschrift;
    }
}
