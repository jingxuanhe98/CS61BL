/**
 * Created by newco on 2017/6/24.
 */
public class ModNCounterTest {
    public static void main(String args[]) {
        ModNCounter a = new ModNCounter(2);
        a.increment();
        a.increment();
        a.increment();
        System.out.println(a.value());
    }
}
