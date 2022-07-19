import transportation.Bus;
import transportation.Taxi;

 enum StateType {
    RUNNING("운행중"),
    GARAGE("차고지행");
    private final String state;
    private StateType(String s) {
        this.state = s;
    }
    public String getName() {
        return this.state;
    }
}
public class main {
    public static void main(String[] args) {
        //버스 인스턴스 생성
        Bus bus1 = new Bus(1004,0);
        Bus bus2 = new Bus(9401, 4);
        // 버스 운행 시작
        bus2.getStarted();
        bus1.getStarted();
        System.out.println("=============1004번 버스 운행 시작=============");
        // 버스 승객 탑승
        bus1.takeCustomer(2);
        // 버스 주유량, 상태 변경
        bus1.changeGasamount(-50);
        bus1.changeState(StateType.GARAGE.getName());
        bus1.changeGasamount(10);
        bus1.changeState(StateType.RUNNING.getName());
        // 가능 인원 초과 ... 현재승객 초기화..?
        bus1.takeCustomer(45);
        bus1.takeCustomer(5);
        // 주유 필요 알럿
        bus1.changeGasamount(-55);
        System.out.println("=====================택시 운행 시작=================");
        // 택시 인스턴스 생성
        Taxi taxi1 = new Taxi(1948);
        Taxi taxi2 = new Taxi (4578);
        // 택시 운행 시작
        taxi2.getStarted();
        taxi1.getStarted();
        System.out.println("=====================1948 택시 운행 시작=================");
        // 택시 승객 탑승
        taxi1.setDestination("서울역");
        taxi1.setDistance(2);
        taxi1.takeCustomer(2);
        // 택시 요금 결제
        taxi1.changeGasamount(-80);
        taxi1.payPrice();
        taxi1.takeCustomer(5);
        taxi1.setDestination("구로지디털단지역");
        taxi1.setDistance(12);
        taxi1.takeCustomer(3);
        taxi1.changeGasamount(-20);
        taxi1.payPrice();
    }
}
