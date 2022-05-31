package item06;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by Hunseong on 2022/06/01
 */
public class MapTest {

    @Test
    void mapTest() {

        Map<String, String> map = new HashMap<>();
        map.put("key", "value");

        Set<String> set1 = map.keySet();
        Set<String> set2 = map.keySet();

        Assertions.assertSame(set1, set2);
    }
}
