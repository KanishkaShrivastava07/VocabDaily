import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Main{
    public static void main(String[] args){

        try {
            URL wordurl = new URL("https://random-word-api.herokuapp.com/word?number=1");

            HttpURLConnection wordcon = (HttpURLConnection) wordurl.openConnection();

            BufferedReader wordin = new BufferedReader(new InputStreamReader(wordcon.getInputStream()));

            String wordline = wordin.readLine();

            wordin.close();

            String word = wordline.substring(2, wordline.length() - 2);

            System.out.println("Word: " + word);

            System.out.println("Search online to find the meaning......");
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
