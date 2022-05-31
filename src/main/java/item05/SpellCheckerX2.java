package item05;

import java.util.Collections;
import java.util.List;

/**
 * Created by Hunseong on 2022/06/01
 */
public class SpellCheckerX2 {
    // 해당 클래스는 오직 Korean Dictionary만 사용 가능하다.
    private final Lexicon dictionary = new KoreanDictionary();

    // 싱글턴 인스턴스
    public static final SpellCheckerX2 INSTANCE = new SpellCheckerX2();

    private SpellCheckerX2() {
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
    static class KoreanDictionary implements Lexicon {}
}
