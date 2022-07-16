import transportation.Bus;
import transportation.Taxi;

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
        bus1.changeState("차고지행");
        bus1.changeGasamount(10);
        bus1.changeState("운행중");
        // 가능 인원 초과 ... 현재승객 초기화..?
        bus1.takeCustomer(45);
        bus1.takeCustomer(5);
        // 주유 필요 알럿
        bus1.changeGasamount(-55);
        System.out.println("=====================택시 운행 시작=================");
        // 택시 인스턴스 생성
        Taxi taxi1 = new Taxi(1948, "서울역", 2);
        Taxi taxi2 = new Taxi (4578, "어린이 대공원", 3);
        // 택시 운행 시작
        System.out.println("=====================1948 택시 운행 시작=================");
        taxi2.getStarted();
        taxi1.getStarted();
        // 택시 승객 탑승
        // 택시 요금 결제


    }
}