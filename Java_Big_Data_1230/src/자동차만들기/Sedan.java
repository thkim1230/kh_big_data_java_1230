package 자동차만들기;
public class Sedan extends Car {

    Sedan(String name) {
        super(name);
        speed = 200;
        mileage = 12;
        maxL = 45;
        seatCnt = 4;
    }

    @Override
    void addF(boolean addF) {
        if (addF = true){
            seatCnt += 1;
        }
    }
}
