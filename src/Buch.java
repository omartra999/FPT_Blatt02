import java.util.Arrays;

public class Buch {
   private Kapitel ersteKapitel;
   private Kapitel[] kapitels;
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

    public Kapitel[] getKapitels() {
        return kapitels;
    }

    public void setKapitels(Kapitel[] kapitels) {
        this.kapitels = kapitels;
    }

    public void addChapter(String title, Text text){
       //define a new kapitel from the information we have from parameter
        Kapitel newKapitel = new Kapitel(title, text, null);
        //define a new kapitels list with the one more entery size than the original
        Kapitel[] newKapitels = new Kapitel[this.kapitels.length + 1];

        //copy the old kapitels in the new array
        for (int i = 0; i <= this.kapitels.length ; i++) {
            newKapitels[i] = this.kapitels[i];
        }
        //add our new chapter in the last index of the new array
        newKapitels[newKapitels.length] = newKapitel;

        //now update our orginal array to be the same as the new one
        this.kapitels = newKapitels;
    }

    @Override
    public String toString() {
       //initial variable to save the kapitels
        String inhalt = "";

        //for each kapitel in our kapitels take the text and add it to our variable
        for (Kapitel kapitel: this.kapitels) {
            inhalt += kapitel.getText();
        }
        //return our variable after it contains all texts from all kapitels
        return inhalt;
    }
}
