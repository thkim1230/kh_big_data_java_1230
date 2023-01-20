package 자동차만들기;
import java.util.Scanner;
public class CarMain {
    public static void main(String[] args) {
        Car car = null;
        int dist = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("이동지역을 선택 하세요 (1.부산, 2.대전, 3.강릉, 4.광주) : ");
        int area = sc.nextInt();
        switch (area) {
            case 1 : dist = 400; break;
            case 2 : dist = 150; break;
            case 3 : dist = 200; break;
            case 4 : dist = 300; break;
        }
        System.out.print("이동할 승객 수를 입력 하세요 : ");
        int passCnt = sc.nextInt();
        System.out.print("이동 차량을 선택 하세요. (1.스포츠카, 2.승용차, 3.버스) : ");
        int selCar = sc.nextInt();
        switch (selCar) {
            case 1:
                car = new SportCar("스포츠카");
                break;
            case 2:
                car = new Sedan("승용차");
                break;
            case 3:
                car = new Bus("버스");
                break;
        }
        System.out.print("부가 기능의 ON/OFF 를 선택 하세요. : ");
        String onOff = sc.next();
        if (onOff.equalsIgnoreCase("on")){
            car.addF(true);
        }else car.addF(false);

        int reCnt = passCnt / car.seatCnt;
        if (passCnt < car.seatCnt) {
            reCnt = 1;
        }
        car.result(dist,reCnt);
    }
}

