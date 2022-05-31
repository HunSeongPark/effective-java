package item03;

/**
 * Created by Hunseong on 2022/05/31
 */
public class Singleton1 {
    // public static 멤버 변수를 통해 싱글턴 인스턴스 생성
    public static final Singleton1 instance = new Singleton1();

    // 생성자의 접근제어자를 private으로 설정하여 외부에서 인스턴스의 생성을 막음
    private Singleton1() {
    }
}
