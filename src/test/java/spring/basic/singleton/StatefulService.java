package spring.basic.singleton;

public class StatefulService {
    private int price; //Stateful

    public void order(String name, int price) {
        System.out.println("name = " + name + " price = " + price);
        this.price = price; //문제 발생 지점
    }

    public int getPrice() {
        return price;
    }
}
