package transportation;

public class Taxi extends transportation implements transportationImpl {


    String destination;
    int distance;
    int currentPassenger;
    int baseDistance;
    int basePrice;
    int pricePerDistance;
    int income;

    int payPrice;

    public Taxi(int num) {
        super(num, 100, 0, 4, "일반");
        this.baseDistance = 1;
        this.basePrice = 3000;
        this.pricePerDistance = 1000;
    }

    public void addPricePerDistance() {

    }

    public void payPrice() {
        this.income += payPrice;
        this.currentPassenger = 0;
        System.out.println("누적요금은 " + this.income + "입니다.");
    }
    public void setDestination(String destination) {
        this.destination = destination;
        System.out.println("목적지는 " + this.destination + "입니다.");
    }

    public void setDistance(int distance) {
        this.distance = distance;
        System.out.println("목적지 까지 거리는 " + this.distance + "km입니다.");
    }
    @Override
    public void takeCustomer(int a) {
        this.currentPassenger += a;
        this.payPrice = (this.basePrice + this.pricePerDistance * (this.distance - this.baseDistance));
        this.state = "운행중";
        if( maxPassenger - currentPassenger >= 0) {
            System.out.println("남은 탑승가능 승객 수는 " + (maxPassenger - currentPassenger) + "입니다.");
            System.out.println("기본요금은 " + this.basePrice + "입니다.");
            System.out.println("지불할 요금은 " + (this.basePrice + this.pricePerDistance * (this.distance - this.baseDistance)) + "입니다.");
            System.out.println("상태는 " + this.state + "입니다.");
        } else {
            System.out.println("최대 승객 수 초과");
            this.currentPassenger = 0;
        }
    }

}
