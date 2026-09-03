import java.util.*;

public class StringMatching {
    public static void main(String[] args) {

        String[] words = {"mass", "as", "hero", "superhero"};

        List<String> ans = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {

            for (int j = 0; j < words.length; j++) {

                if (i != j && words[j].contains(words[i])) {
                    ans.add(words[i]);
                    break;
                }
            }
        }

        System.out.println(ans);
    }
}
