public class UnfairWaitList<E> extends WaitList<E> {
    public UnfairWaitList() {
        super();
    }


    public void remove(E element) {
        if (content.contains(element))
            content.remove(element);
    }

    public void moveToBack(E element) {
        remove(element);
        content.add(element);

    }
}