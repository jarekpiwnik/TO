import java.util.List;

public class Util {
    public static void listResult(List result) {
        System.out.println(result.size());
        for (Object o : result) System.out.println(o);
    }
}
