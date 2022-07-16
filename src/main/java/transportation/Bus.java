package transportation;

public class Bus extends transportation{
    int currentPassenger;
    int price;

    public Bus(int num, int currentPassenger) {
        super(num, 30, "운행");
        this.currentPassenger = currentPassenger;
        this.price = 1000;
    }

    public void takeCustomer(int a) {
        this.currentPassenger += a;
        if( maxPassenger - currentPassenger >= 0) {
        System.out.println("남은 탑승가능 승객 수는 " + (maxPassenger - currentPassenger) + "입니다.");
        System.out.println("요금은 " + this.price * a + "입니다.");
        } else {
            System.out.println("최대 승객 수 초과");
            this.currentPassenger = 0;
        }
    }

}
