package transportation;

public class Taxi extends transportation{
    String destination;
    int distance;
    int baseDistance;
    int basePrice;
    int pricePerDistance;

    public Taxi(int num, String destination, int distance) {
        super(num, 100, 0, 4, "일반");
        this.destination = destination;
        this.distance = distance;
        this.baseDistance = 1;
        this.basePrice = 3000;
        this.pricePerDistance = 1000;
    }

    public void addPricePerDistance() {

    }

    public void payPrice() {

    }

}
