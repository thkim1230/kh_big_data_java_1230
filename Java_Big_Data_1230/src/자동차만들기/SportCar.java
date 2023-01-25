package 자동차만들기;
public class SportCar extends Car {

    SportCar(String name) {
        super(name);
        speed = 250;
        mileage = 8;
        maxL = 30;
        seatCnt = 2;
    }

    @Override
    void addF(boolean addF) {
        if (addF) {
            speed *= 1.2;
        }
    }
}
