public class Text {
    private String text;

    public Text(String text){
        this.text = text;
    }

    public String getText(){
        return this.text;
    }

    public void setText(String text){
        this.text = text;
    }

    public String caesarVerschleusselung(int verschiebung) {
        String result = "";
        for (char c : text.toCharArray()) {
            if (c != ' ') {
                int orginalAlphabetPositin = c - 'a';
                int newAlphabetPosition = (orginalAlphabetPositin + verschiebung) % 26;
                char newChar = (char)('a' + newAlphabetPosition);
                result += newChar;
            }else{
                result += c;
            }
        }
        return result;
    }
    public int wortAnzahl(){
        return text.split(" ").length;
    }
    public void wortSchnittMenge(Text andererText) {
        String[] words1 = andererText.getText().split(" |,");
        String[] words2 = text.split(" |,");

        for (String word1 : words1) {
            for (String word2 : words2) {
                if (word1.equals(word2)){
                    System.out.println(word1);
                }
            }
        }
    }
    @Override
    public String toString() {
        return "Text{" +
                "text='" + text + '\'' +
                '}';
    }
}
