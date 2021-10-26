import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 测试jdk
 *
 * @author gujiedmc
 * @date 2021-10-20
 */
public class JdkDemo {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>(1);

        list.add("haha");
        list.add("haha");

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < 15; i++) {
            map.put(i, i);
        }
    }
}
