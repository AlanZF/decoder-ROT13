import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    final static String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static String[] convertStringToArray(String text) {
        String[] convText = text.split("");
        return convText;
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

    public String decodeEncode(String message) {
        List<Integer> indexes = findIndex(message);
        String[] a = convertStringToArray(alphabet);
        String[] letter = new String[indexes.size()];

        for(int i = 0; i < indexes.size(); i++) {
            if(indexes.get(i) == -1) {
                letter[i] = "";
            } else {
                letter[i] = a[indexes.get(i)+13];
            }
        }
        return Arrays.toString(letter);
    }
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.decodeEncode("URYYB JBEYQ"));
    }
}