package item01;

/**
 * Created by Hunseong on 2022/05/31
 */
public class ProsC {

    // 반환 타입의 하위 타입 객체를 반환 가능
    public static ProsC getProsC(Boolean flag) {
        return flag ? new ProsC() : new Child();
    }

    public static void main(String[] args) {
        ProsC prosC = ProsC.getProsC(true);
        ProsC child = ProsC.getProsC(false);

        System.out.println(prosC instanceof ProsC); // true
        System.out.println(prosC instanceof Child); // false
        System.out.println(child instanceof Child); // true
    }

    static class Child extends ProsC {
    }
}
