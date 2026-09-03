import java.util.*;

class replacepattern {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> result = new ArrayList<>();

        for (String word : words) {

            HashMap<Character, Character> map1 = new HashMap<>();
            HashMap<Character, Character> map2 = new HashMap<>();

            boolean match = true;

            for (int i = 0; i < word.length(); i++) {

                char w = word.charAt(i);
                char p = pattern.charAt(i);

                // word -> pattern
                if (map1.containsKey(w)) {
                    if (map1.get(w) != p) {
                        match = false;
                        break;
                    }
                } else {
                    map1.put(w, p);
                }

                // pattern -> word
                if (map2.containsKey(p)) {
                    if (map2.get(p) != w) {
                        match = false;
                        break;
                    }
                } else {
                    map2.put(p, w);
                }
            }

            if (match) {
                result.add(word);
            }
        }

        return result;
    }
}
