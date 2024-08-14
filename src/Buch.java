public class Buch {
   private Kapitel ersteKapitel;

   public Buch(Kapitel ersteKapitel){
       this.ersteKapitel = ersteKapitel;
   }

    public Kapitel getErsteKapitel() {
        return ersteKapitel;
    }

    public void setErsteKapitel(Kapitel ersteKapitel) {
        this.ersteKapitel = ersteKapitel;
    }
}
