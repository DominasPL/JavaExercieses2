package enums;

public enum Mobile {
    APPLE(100), SAMSUNG(80), HTC(90);

    private int price;

    Mobile(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

}


