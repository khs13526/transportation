package transportation;

public class transportation implements transportationImpl {
    int num;
    int gasAmount;
    int velocity;


    int maxPassenger;
    String state;


    public transportation(int num, int gasAmount, int velocity, int maxPassenger, String state) {
        this.num = num;
        this.gasAmount = gasAmount;
        this.velocity = velocity;
        this.maxPassenger = maxPassenger;
        this.state = state;
    }

    public transportation(int num, int maxPassenger, String state) {
        this.num = num;
        this.maxPassenger = maxPassenger;
        this.state = state;
        this.velocity = 0;
        this.gasAmount = 100;
    }

    @Override
    public void getStarted() {
        this.state = "운행중";
        System.out.println("운행이 시작되었습니다. 번호는 " + this.num + "입니다.");
    }

    @Override
    public void takeCustomer(int a) {
    }

    @Override
    public void changeVelocity(int a) {
        this.velocity = a;
        System.out.println("속도가 " + a + "로 변경되었습니다.");
    }

    @Override
    public void changeState(String s) {
        this.state = s;
        System.out.println("상태가 " + s + "로 변경되었습니다.");
    }

    @Override
    public void changeGasamount(int a) {
        this.gasAmount += a;
        System.out.println("남은 주유량은 " + this.gasAmount + "입니다.");
        if (this.gasAmount < 10) {
            if (this.gasAmount == 0) {
                this.state = "운행불가";
                System.out.println(this.state);
            }
            System.out.println("주유 필요");
        }
    }


}
