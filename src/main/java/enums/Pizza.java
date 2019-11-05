package enums;

public class Pizza {

    private PizzaSize size;

    public Pizza(PizzaSize size) {
        this.size = size;
    }

    public void getData() {
        System.out.println("Pizza diameter " + size.getDiameter());
    }

    public static void main(String[] args) {

        for (PizzaSize size : PizzaSize.values()) {
            System.out.println(size.toString() + "  " + size.getDiameter() + " " + size.getArea());

        }

    }

}
