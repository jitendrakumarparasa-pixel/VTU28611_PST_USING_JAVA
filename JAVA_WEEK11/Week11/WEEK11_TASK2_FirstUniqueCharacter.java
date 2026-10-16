import java.util.HashMap;
import java.util.Map;

public class WEEK11_TASK2_FirstUniqueCharacter {
    public static int firstUniqueCharacterIndex(String s) {
        Map<Character, Integer> freq = new HashMap<>();

        for (char ch : s.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (freq.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        String text = "aabbcde";
        int index = firstUniqueCharacterIndex(text);
        System.out.println("First unique character index: " + index);
    }
}
