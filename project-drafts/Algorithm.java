import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* Program testing to develop logic to decode/encode the message */
public class Algorithm {
    final static String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static String[] convertStringToArray(String text) {
        String[] convText = text.split("");
        return convText;
    }

    public static String convertArrayToString(String[] array) {
        String str = "";
        for(int i = 0; i < array.length; i++) {
            if(array[i] == "") {
                str += "\s";
            } else {
                str += array[i];
            }
        }
        return str;
    }

    public List<Integer> findIndex(String message) {
        String[] msg = convertStringToArray(message);
        List<Integer> indexes = new ArrayList<>();

        for(int i = 0; i < msg.length; i++) {
            int index = alphabet.indexOf(msg[i]);
            Integer idx = index;
            indexes.add(idx);
        }
        return indexes;
    }

    public String decode(String message) {
        List<Integer> indexes = findIndex(message);
        String[] a = convertStringToArray(alphabet);
        String[] letters = new String[indexes.size()];

        for(int i = 0; i < indexes.size(); i++) {
            if(indexes.get(i) == -1) {
                letters[i] = "";
            } else {
                letters[i] = a[indexes.get(i)+13];
            }
        }
        String decipheredMessage = convertArrayToString(letters);
        return decipheredMessage;
    }

    public static void main(String[] args) {
        Algorithm alg = new Algorithm();
        System.out.println(alg.decode("URYYB JBEYQ"));
    }
}