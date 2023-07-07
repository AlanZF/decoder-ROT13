public class Main {
    final static String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static String[] convText(String text) {
        String[] convText = text.split("");
        return convText;
    }

    // Separar em 2 métodos: findIndex, que retorna só o index
    // e convLetter, que converte os indexes nas letras correspondentes
    public static void findIndex(String message) {
        String[] a = convText(alphabet);
        String[] m = convText(message);
        String convLetter;
        for(int i = 0; i < m.length; i++) {
            int idx = alphabet.indexOf(m[i]);
            if(idx == -1) {
                convLetter = "";
            } else {
                convLetter = a[idx+13];
            }
            System.out.println(convLetter);
        }
    }

    public static void main(String[] args) {
        findIndex("URYYB JBEYQ");
    }
}