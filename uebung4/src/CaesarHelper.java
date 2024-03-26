public class CaesarHelper {

    private static final char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};


    public static char[] encode(char[] message, char startLetter) {
        //TODO implement
        return null;
    }

    public static void main(String[] args) {
        char startLetter = 'c';
        char[] message = "attack at dawn!".toCharArray();
        char[] encodedMessage = encode(message, 'c');
        print(startLetter, message, encodedMessage);
    }

    private static void print(char startLetter, char[] message, char[] encodedMessage) {
        System.out.println("Schlüssel: " + startLetter);
        for (int i = 0; i < message.length; i++) {
            System.out.println(message[i] + "\t\t" + encodedMessage[i]);
        }
    }
}
