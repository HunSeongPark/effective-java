package item01;

/**
 * Created by Hunseong on 2022/05/31
 */
public class ProsB {

    private static final ProsB INSTANCE = new ProsB();

    // 호출될 때마다 같은 인스턴스를 반환할 수 있음
    public static ProsB getInstance() {
        return INSTANCE;
    }

    public static void main(String[] args) {
        ProsB instance = ProsB.getInstance();
        ProsB instance2 = ProsB.getInstance();
        System.out.println(instance == instance2); // true
        System.out.println(instance.equals(instance2)); // true
    }
}
