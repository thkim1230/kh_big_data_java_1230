package 객체직렬화예제2번;

import java.io.*;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SerialMenuWrite {
    static Map<String,CoffeeMenuInfo> map = new HashMap<>();
    public static void main(String[] args) throws IOException {
    menuWrite();
    selectMenu();

    }
    static void menuWrite() {
        map.put("Americano",new CoffeeMenuInfo("Americano",2500,"Coffee","그냥 커피 입니다."));
        map.put("Espresso",new CoffeeMenuInfo("Espresso",2500,"Coffee","진한 커피 입니다.."));
        map.put("Latte",new CoffeeMenuInfo("Latte",4500,"Coffee","우유가 들어간 커피 입니다."));
    }
    static void selectMenu() throws IOException {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("메뉴를 선택 하세요 : ");
            System.out.print("[1] 메뉴 보기, [2] 메뉴 추가, [3] 종료 : ");
            int menu = sc.nextInt();
            switch (menu) {
                case 1 :
                    System.out.println("======== 메뉴 보기 ========");
                    for (String e : map.keySet()) {
                        System.out.println("메뉴 : " + map.get(e).getName());
                        System.out.println("가격 : " + map.get(e).getPrice());
                        System.out.println("분류 : " + map.get(e).getGroup());
                        System.out.println("설명 : " + map.get(e).getDesc());
                        System.out.println("----------------------------------");
                    }
                    break;
                case 2 :
                    System.out.print("추가할 메뉴를 입력 하세요 : ");
                    String key = sc.next();
                    if (map.containsKey(key)) {
                        System.out.println("해당 메뉴가 이미 존재합니다.");
                    } else {
                        System.out.print("가격 입력 : ");
                        int price = sc.nextInt();
                        System.out.print("분류 입력 : ");
                        String group = sc.next();
                        sc.nextLine(); // 버퍼 지우기
                        System.out.print("설명 입력 : ");
                        String desc = sc.nextLine();
                        map.put(key,new CoffeeMenuInfo(key,price,group,desc));
                    }
                    break;
                case 3 :
                    System.out.println("메뉴를 종료합니다. 내용을 파일에 저장 합니다.");
                    FileOutputStream fos = new FileOutputStream("D:/직렬화파일/커피메뉴.bin");
                    ObjectOutputStream oos = new ObjectOutputStream(fos);
                    oos.writeObject(map);
                    oos.flush();
                    oos.close();
                    return;
            }
        }
    }
}
