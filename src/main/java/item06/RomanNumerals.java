package item06;

import java.util.regex.Pattern;

/**
 * Created by Hunseong on 2022/06/01
 */
public class RomanNumerals {

    static boolean isRomanNumeral(String s) {
        // String.matches 내부에서 새로운 Pattern 인스턴스를 생성
        //    -> isRomanNumeral 메서드를 호출 할 때 마다 새로운 Pattern 인스턴스를 생성
        // Pattern 인스턴스는 정규표현식에 해당하는 FSM을 만드므로 인스턴스 생성비용이 높다.
        return s.matches("^(?=.)M*(C[MD]|D?C{0,3})"
                + "(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");
    }

    // 인스턴스 생성비용이 높은 Pattern 인스턴스를 미리 생성해두고, 해당 인스턴스를 재사용
    private static final Pattern ROMAN = Pattern.compile("^(?=.)M*(C[MD]|D?C{0,3})"
            + "(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");

    static boolean isRomanNumeral2(String s) {
        return ROMAN.matcher(s).matches();
    }
}
