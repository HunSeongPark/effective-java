package item05;

import java.util.Collections;
import java.util.List;

/**
 * Created by Hunseong on 2022/06/01
 */
public class SpellChecker {
    private final Lexicon dictionary;

    // 의존 객체 주입을 통해 원하는 dictionary를 설정할 수 있다.
    public SpellChecker(Lexicon dictionary) {
        this.dictionary = dictionary;
    }

    public boolean isValid(String word) {
        // valid check
        return true;
    }

    public List<String> suggestions(String typo) {
        // suggestions work
        return Collections.emptyList();
    }

    interface Lexicon {}
}
