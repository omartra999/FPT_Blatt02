public class Main {
    public static void main(String[] args) {
        Text text = new Text("Hello my dear friend, I am trying this program 123 /n ");
        Text text2 = new Text("Hello, back to you my friend, I am replying to you");
        System.out.println(text.caesarVerschleusselung(3));
        text.wortSchnittMenge(text2);

        }
    }
