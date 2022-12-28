public class BoundedWaitList<E>extends WaitList<E> {
    private int capacity;
    private int filled;

    public BoundedWaitList(int capacity) {
        super();
        this.capacity = capacity;
        this.filled = 0;
    }


    public int getCapacity() {
        return capacity;
    }


    public void add(E element) {
        if (filled < capacity) {
            super.add(element);
            filled++;
        }
    }


    @Override
    public E remove() {
        filled--;
        return super.remove();
    }


    @Override
    public String toString() {
        return "BoundedWaitList [capacity=" + capacity + ", filled=" + filled + "]";
    }
}
