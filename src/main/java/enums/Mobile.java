package enums;

public enum Mobile {
    APPLE(100), SAMSUNG(80), HTC(90);

    private int price;
    private static long id = 10;

    Mobile(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
    public static long getId() {
        return id;
    }
}


