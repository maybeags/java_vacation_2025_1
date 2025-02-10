package chapter09_setter_getter;
/*
    1. Setter / Getter의 필요성
        문제 상황
        클래스를 만든다고 가정해보겠습니다. 예를 들어 사람(Person) 클래스를 만들면서
        이름(name), 나이(age) 등의 정보를 저장하기 위해 필드를 선언합니다.

        public class Person {
            String name;
            int age;
        }

        그리고 이를 PersonMain에서 객체를 생성했다고 가정하겠습니다.

        public class PersonMain {
            public static void main(String[] args) {
                // Person 객체 생성
                Person person01 = new Person();

                // 속성에 값 대입
                person01.name = "안근수";
                person01.age = -10;
            }
        }

    해당 코드를 확인했을 때 나이에 정상적이지 않은 값이 대입돼 있습니다.
    이처럼 외부에서 직접 접근이 가능 했을 때, 이상한 값이 들어가더라도 통제할 수 있는
    방법이 없다는 문제가 있습니다. -> 이를 해결하기 위한 방법이 Setter / Getter

    2. Setter / Getter란?

        Setter : 데이터를 "설정"하는 역할의 "method." 클래스 외부에서 필드를 직접
        수정하지 못하도록 막고, 특정 메서드를 통해 값을 전달 받아 초기화 및 수정

        Getter : 데이터를 "조회"하는 역할의 "method." 클래스 외부에서 필드를 직접
        읽지 못하도록 막고, 특정 메서드를 통해 안전하게 값을 반환합니다.


 */








public class SetterGetter {
}
