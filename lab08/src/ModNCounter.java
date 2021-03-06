public class ModNCounter {

    private int myCount;
    private int N;

    public ModNCounter(int N) {
        myCount = 0;
        this.N = N;
    }

    public void increment() {
        myCount = (myCount + 1) % N;
    }

    public void reset() {
        myCount = 0;
    }

    public int value() {
        return myCount;
    }

}
