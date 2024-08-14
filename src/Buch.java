public class Buch {
   private Kapitel ersteKapitel;
   private Autor autor;

   public Buch(Kapitel ersteKapitel, Autor autor){
       this.ersteKapitel = ersteKapitel;
       this.autor = autor;
   }

    public Kapitel getErsteKapitel() {
        return ersteKapitel;
    }

    public void setErsteKapitel(Kapitel ersteKapitel) {
        this.ersteKapitel = ersteKapitel;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
}
