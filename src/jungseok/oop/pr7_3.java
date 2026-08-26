package jungseok.oop;


class Product {
    int price;
    int bonusPoint;

    Product(int price) {
        this.price = price;
        bonusPoint = (int) (price / 10.0);
    }
}

class Tv extends Product {

    Tv() {
        // Tv에는 추가적인 필드가 존재하지 않아도, Product를 상속받은 Tv는 부모의 필드를 가지고 있기 때문에,
        // 부모의 필드를 초기화해줘야한다.
        super(2000);
    }

    public String toString() {
        return "Tv";
    }
}

public class pr7_3 {
    public static void main(String[] args) {
        Tv t = new Tv();
    }

}
