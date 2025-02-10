package chapter08_classes.constructor;

public class ConstructorMain {
    public static void main(String[] args) {
        // 기본 생성자를 통한 인스턴스 생성
        Constructor constructor0 = new Constructor();

        // 매개변수 생성자를 통한 인스턴스 생성
        Constructor constructor1 = new Constructor(38);

        // 객체인 constructor0의 속성에 값을 대입하는 방법
        constructor1.name = "안근수";

        System.out.println(constructor1.name);
        System.out.println(constructor1.num);

        Constructor constructor2 = new Constructor("안근순");
        constructor2.num = 20;
        System.out.println(constructor2.name);
        System.out.println(constructor2.num);
    }
}
