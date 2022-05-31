package item06;

import static java.lang.Integer.MAX_VALUE;

/**
 * Created by Hunseong on 2022/06/01
 */
public class AutoboxingTest {

    private static long sum() {
        // long이 아닌 Long 타입으로 선언하여 오토박싱에 의해 새로운 Long 인스턴스가 계속 생성된다.
        Long sum = 0L;
        for (long i = 0; i <= MAX_VALUE; i++) {
            sum += i;
        }
        return sum;
    }
}
