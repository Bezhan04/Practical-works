package Shop;

import Shop.Shop;

public class Tester {
    public static void main(String[] args) { Shop shop = new Shop();
        Client client = new Client(); client.order(shop);
    }

}
