package 자동차만들기;
public class Bus extends Car {

    Bus(String name) {
        super(name);
        speed = 150;
        mileage = 5;
        maxL = 100;
        seatCnt = 20;
    }

    @Override
    void addF(boolean addF) {
        if (addF){
        maxL += 30;
        }
    }
}

