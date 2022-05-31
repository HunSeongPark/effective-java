package item04;

/**
 * Created by Hunseong on 2022/06/01
 */
public class UtilityClass {
    // 기본 생성자 생성 방지 (인스턴스화 방지)
    private UtilityClass() {
        throw new AssertionError();
    }
}
