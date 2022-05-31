package item03;

/**
 * Created by Hunseong on 2022/05/31
 */
public class SingletonClient {
    public static void main(String[] args) {
//        Singleton1 singleton1 = new Singleton1(); 생성 불가
        Singleton1 instance1 = Singleton1.INSTANCE;
        Singleton1 instance2 = Singleton1.INSTANCE;
        System.out.println(instance1 == instance2); // true

//        Singleton2 singleton2 = new Singleton2(); 생성 불가
        Singleton2 instance3 = Singleton2.getInstance();
        Singleton2 instance4 = Singleton2.getInstance();
        System.out.println(instance3 == instance4); // true
    }
}
