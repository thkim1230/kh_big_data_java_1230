package 자동차만들기;
public abstract class Car {

    protected String name;
    protected int speed;
    protected int mileage;
    protected int maxL;
    protected int seatCnt;

    abstract void addF(boolean addF);

    Car(String name){
        this.name = name;
    }
    void result (int area, int reCnt) {
        int needLiter = ((area * reCnt) / mileage);
        int cnt = (needLiter / maxL) + 1;
        double hour = (double) (area * reCnt) / (double) speed;
        System.out.println("이동에 필요한 총 비용은 " + (needLiter * 2000) + "원 입니다.");
        System.out.println("주유횟수 : " + cnt + "회");
        System.out.printf("총 소요 시간 : %.2f시간",hour);
    }
}
