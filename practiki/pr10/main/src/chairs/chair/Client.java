package chairs.chair;

public class Client {
    private Chair chair;

    public void sit() {
        if (chair instanceof MagicChair) ((MagicChair) chair).doMagic();
        else
            System.out.println(chair);
    }

    public void setChair() {
        AbstractChairFactory factory = new ChairFactory();
        this.chair = factory.createMagicChair();

    }
}