package item01;

/**
 * Created by Hunseong on 2022/05/31
 */
public class ProsA {

    private String name;
    private String nickname;

    public ProsA() {
    }

    // 생성자 (이름을 가질 수 없다)
    public ProsA(String name) {
        this.name = name;
    }

    // 생성자 (같은 시그니처를 여러개 만들 수 없다)
//    public ProsA(String nickname) {
//        this.nickname = nickname;
//    }

    // 정적 팩토리 메서드 (반환되는 객체의 특성을 설명하는 이름을 가질 수 있다)
    public static ProsA withName(String name) {
        return new ProsA(name);
    }

    // 정적 팩토리 메서드 (같은 시그니처를 여러개 만들 수 있다)
    public static ProsA withNickname(String nickname) {
        ProsA prosA = new ProsA();
        prosA.nickname = nickname;
        return prosA;
    }

    public static void main(String[] args) {
        // 생성자 - 객체의 특성을 명확히 설명하지 못함
        ProsA c1 = new ProsA("hunseong");

        // 정적 팩토리 메서드 - hunseong이 Foo의 name으로 지정됨이 명확함
        ProsA c2 = ProsA.withName("hunseong");

        // 정적 팩토리 메서드 - 여러 시그니처를 가지는 메서드를 만들 수 있음
        ProsA c3 = ProsA.withNickname("훙성");
    }
}
