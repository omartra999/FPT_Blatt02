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
        //empty String to save our answer
        String result = "";

        //change the text attribute to an array and iterate through its elements (letters)
        for (char c : text.toCharArray()) {
            //if the letter is not a space then find out its position in the ASCII alphabet
            if (c != ' ') {
                int orginalAlphabetPositin = c - 'a';
                //the new position is the old position + the verschiebung parameter and the mod 26 because of 26 alphabet letters in ASCII
                int newAlphabetPosition = (orginalAlphabetPositin + verschiebung) % 26;
                //the encrypted letter is the letter in the new position
                char newChar = (char)('a' + newAlphabetPosition);
                //add the new letter to our result String
                result += newChar;
            //if the letter is an empty space then add an empty space to our result String
            }else{
                result += c;
            }
        }

        return result;
    }
    //split() fuction splits a string to an array of strings in our case the regex is an empty string so it will make
    //an array of every string coming after an empty space in the text which means every word
    public int wortAnzahl(){
        return text.split(" ").length;
    }


    public void wortSchnittMenge(Text andererText) {
        //the split function here is having " " and "," as parameters so it will make
        //an Array of strings coming after "," and empty spaces
        //the "|" means "or"

        //array of words from parameter text
        String[] words1 = andererText.getText().split(" |,");
        //array of words from this text
        String[] words2 = text.split(" |,");
        //iterate through every elements from both arrays and find matching ones then print them
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
