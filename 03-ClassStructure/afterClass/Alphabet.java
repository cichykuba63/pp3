package afterClass;

public class Alphabet {
    static boolean isAlphabet(String t) {
        char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        char[] str = t.toCharArray();
        short prevIndex = -1;
        short index = -1;

        for (char letter1: str) {
            index = -1;
            for (char letter2: letters) {
                index++;
                if (letter1 == letter2) {
                    if (prevIndex <= index) {
                        prevIndex = index;
                        break;
                    } else
                        return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String name = "aabcdeeefaa";

        System.out.println(Alphabet.isAlphabet(name.toLowerCase()));
    }
}
