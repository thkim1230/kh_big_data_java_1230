package 아이패드만들기;

public class IPadProMain {
    public static void main(String[] args) throws InterruptedException {
        while (true){
            IPadProMake ipad = new IPadProMake("iPad Pro");
            if (!ipad.continueOrder()) break;
            ipad.setScreen();
            ipad.setColor();
            ipad.setMemory();
            ipad.setNetwork();
            ipad.setName();
            ipad.setSerialNam();
            ipad.inProductPad();
            ipad.productPad();
        }
    }
}
