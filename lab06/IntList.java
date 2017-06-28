/**
 * A data structure to represent a Linked List of Integers.
 * Each IntList represents one node in the overall Linked List.
 * Encapsulated version.
 */
public class IntList {

    /**
     * The head of the list is the first node in the list.
     * If the list is empty, head is null
     */
    private IntListNode head;
    private int size;

    public IntList() {
    }

    public IntList(int[] initial) {
        for (int i = initial.length - 1; i >= 0; i--) {
            head = new IntListNode(initial[i], head);
        }
        size = initial.length;
    }

    /**
     * Merge two sorted IntLists a and b into one sorted IntList containing all of their elements.
     *
     * @return a new IntList without modifying either parameter
     */
    public static IntList merge(IntList a, IntList b) {
        IntListNode t = a;
        while (t.next != null) {
            t = t.next;
        }
        t.next = b.head;
        return a;
    }

    public int getSize() {
        return size;
    }

    /**
     * Get the value at position pos. If the position does not exist, throw an
     * IndexOutOfBoundsException.
     *
     * @param position to get from
     * @return the int at the position in the list.
     */
    public int get(int position) {
        if (position >= size) throw new IndexOutOfBoundsException("Position larger than size of list.");
        IntListNode curr = head;
        while (position > 0) {
            curr = curr.next;
            position--;
        }
        return curr.item;
    }

    /* Fill in below! */

    /**
     * Insert a new node into the IntList.
     *
     * @param x        value to insert
     * @param position position to insert into. If position exceeds the size of the list, insert into
     *                 the end of the list.
     */
    public void insert(int x, int position) {
        IntListNode curr = head;
        while (position > 1) {
            curr = curr.next;
            position--;
        }
        IntListNode t = curr.next;
        curr.next = new IntListNode(x, curr);
        curr.next.next = t;
    }

    /**
     * Reverse the current list recursively, using a helper method.
     */
    public void reverse() {
        // Fill me in!
    }

    /**
     * Remove the node at position from this list.
     *
     * @param position int representing the index of the node to remove. If greater than the size
     *                 of this list, throw an IndexOutOfBoundsException.
     */
    public void remove(int position) {
        if (position >= size) throw new IndexOutOfBoundsException();
        IntListNode curr = head;
        while (position > 1) {
            curr = curr.next;
            position--;
        }
        curr.next = curr.next.next;
    }

    /* Optional! */

    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof IntList)) return false;
        if (!super.equals(object)) return false;

        IntList intList = (IntList) object;

        if (getSize() != intList.getSize()) return false;
        if (head != null ? !head.equals(intList.head) : intList.head != null) return false;

        return true;
    }

    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (head != null ? head.hashCode() : 0);
        result = 31 * result + getSize();
        return result;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "IntList{" +
                "head=" + head +
                ", size=" + size +
                '}';
    }

    /**
     * IntListNode is a nested class. It can be instantiated
     * when associated with an instance of IntList.
     */
    public class IntListNode {
        int item;
        IntListNode next;

        public IntListNode(int item, IntListNode next) {
            this.item = item;
            this.next = next;
        }
    }
}
