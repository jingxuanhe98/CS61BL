public class TestExceptions {

    public static void main(String[] args) {
        try {
            throw new NullPointerException();
        } catch (NullPointerException e) {
            System.out.println("got null pointer");
        }
        try {
            throw new ArrayStoreException();
        } catch (ArrayStoreException e) {
            System.out.println("got illegal array store");
        }
        try {
            throw new ClassCastException();
        } catch (ClassCastException e) {
            System.out.println("got illegal class cast");
        }
    }

}
