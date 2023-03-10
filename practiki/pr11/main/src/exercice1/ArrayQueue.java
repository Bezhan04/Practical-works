package exercice1;

public class ArrayQueue {
    private int size;
    private int head;
    private int tail;
    private Object[] elements;

    public ArrayQueue(int size) {
        elements = new Object[10];
    }

    private void capacity(int cap) {
        int len = elements.length;
        if (cap > len) {
            Object[] newElements = new Object[elements.length * 2];

            int i = 0;
            while (tail != head) {
                newElements[i] = elements[head];
                head = (head + 1) % len;
                i++;
            }

            head = 0;
            tail = len - 1;
            elements = newElements;
        }
    }

    /**
     * pre: element != null
     * <p>
     * pst: elements[tail] = element
     * tail = (tail + 1) % elements.length
     * size = size + 1
     */
    public void enqueue(Object element) {
        assert element != null;

        capacity(size + 2);

        elements[tail] = element;
        tail = (tail + 1) % elements.length;
        size++;
    }

    /**
     * pre: size > 0
     * <p>
     * pst: @return elements[head]
     */
    public Object element() {
        assert size > 0;
        return elements[head];
    }

    /**
     * pre: size > 0
     * <p>
     * pst: @return elements[head]
     * head = (head + 1) % elements.length
     * size = size - 1
     */
    public Object dequeue() {
        Object ret = element();
        elements[head] = null;
        head = (head + 1) % elements.length;
        size--;
        return ret;
    }

    /**
     * pst: @return size
     */
    public int size() {
        return size;
    }

    /**
     * pst: @return size == 0
     */
    public boolean isEmpty() {
        return (size == 0);
    }

    /**
     * pst: size = 0
     * head = 0
     * tail = 0
     */
    public void clear() {
        head = 0;
        tail = 0;
        size = 0;
    }

}
