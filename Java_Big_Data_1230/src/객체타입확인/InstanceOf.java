package 객체타입확인;
// instanceof : 개체 타입 확인 연산자 , 부모와 자식 관계 성립 여부를 확인
public class InstanceOf {
    public static void main(String[] args) {
        Parent parent = new Parent("부모");
        Child child = new Child("자식");

        System.out.println(parent instanceof Parent); // True 부모클래스를 참조해서 만든 생성자인가
        System.out.println(child instanceof Parent); // True
        System.out.println(parent instanceof Child); // False 자식클래스를 참조해서 만든 생성자인가
        System.out.println(child instanceof Child); // True
    }
}

class Parent{
    String name;

    public Parent(String name) {
        this.name = name;
    }
}

class Child extends Parent{
    public Child(String name) {
        super(name);
        this.name = name;
    }
}