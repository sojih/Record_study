package chapter06;

public class TvTest {
    public static void main(String[] args) {
//        TV t;            // TV클래스 타입의 참조변수 t 선언
//        t = new TV();    // TV인스턴스 생성, 생성된 인스턴스 주소를 t에 저장(ex. t에 주소 0x100 저장)

        TV t1 = new TV();   // TV인스턴스 주소를 t1에 저장 ex. t1 <- 0x100
        TV t2 = new TV();   // TV인스턴스 주소를 t2에 저장 ex. t2 <- 0x200

        t1.channel = 7;
        System.out.println(t1.channel); // 7
        System.out.println(t2.channel); // 0 출력됨

//        t2 = t1;
        // t2가 원래 참조하던 인스턴스는 사용할 수 없게 되고
        //가비지 컬렉터에 의해 자동적으로 메모리에서 제거됨


        // 객체 배열
        TV[] arr = new TV[3];   // = TV tv1, tv2, tv3;

        // 객체를 생성하여 배열의 각 요소에 저장(하지 않으면 객체가 저장된 것이 아님!)
//        arr[0] = new TV();
//        arr[1] = new TV();
//        arr[2] = new TV();
        // 다뤄야할 객체 수가 많을 때는 반복문 사용
        for(int i = 0; i < arr.length; i++) {
            arr[i] = new TV();
        }
    }
}
class TV {
    // 속성 - 인스턴스가 다르면 다른 값을 가질 수 있음
    String color;
    boolean power;
    int channel;

    // 기능 - 인스턴스가 달라도 같은 기능 유지
    void power() {
        power = !power;
    }
    void channelUp() {
        ++channel;
    }
    void channelDown() {
        --channel;
    }
}
