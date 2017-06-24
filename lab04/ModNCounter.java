public class ModNCounter extends Counter {
    int n;

    public ModNCounter(int n) {
        super();
        this.n = n;
    }

    @Override
    public void increment() {
        super.increment();
    }

    @Override
    public void reset() {
        super.reset();
    }

    @Override
    public int value() {
        return super.value() % n;
    }
}
