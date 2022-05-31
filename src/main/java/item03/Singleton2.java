package item03;

import java.io.Serializable;

/**
 * Created by Hunseong on 2022/05/31
 */
public class Singleton2 implements Serializable {

    private static final Singleton2 INSTANCE = new Singleton2();

    // 역직렬화 시 싱글턴을 보장
    private Object readResolve() {
        return INSTANCE;
    }

    private Singleton2() {
    }

    // 정적 팩터리 메서드를 통해 같은 instance 반환
    public static Singleton2 getInstance() {
        return INSTANCE;
    }
}
