import java.util.ArrayList;
import java.util.List;

public class Main {
    final static String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static String[] convText(String text) {
        String[] convText = text.split("");
        return convText;
    }

    // Separar em 2 métodos: findIndex, que retorna só o index
    // e convLetter, que converte os indexes nas letras correspondentes
    List<String> indexes = new ArrayList<>();
    int idx = 0;
    public List<String> findIndex(String message) {
        String[] a = convText(alphabet);
        String[] m = convText(message);
        //String convLetter;
        for(int i = 0; i < m.length; i++) {
            idx = alphabet.indexOf(m[i]);
            indexes.add(Integer.toString(idx));
        }
        return indexes;
    }

    /*public void convLetter() {
        if(idx == -1) {
            convLetter = "";
        } else {
            convLetter = a[idx+13];
        }
        System.out.println(convLetter);
    }*/

    public static void main(String[] args) {
        Main m = new Main();
        System.out.println(m.findIndex("URYYB JBEYQ"));
    }
}