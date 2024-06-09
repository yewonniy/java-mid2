package generic.ex1;

public class RowTypeMain {

    public static void main(String[] args) {
        GenericBox integerBox = new GenericBox(); // 이걸 row type 이라고 함. 이렇게 쓰지 말기~
        // GenericBox<Object> integerBox = new GenericBox<>(); => 위와 같은데 이걸 권장
        integerBox.set(10); // object로 셋팅됨.
        Integer result = (Integer) integerBox.get();
        System.out.println("result = " + result);
        // 근데 웬만하면 다이아몬드 속에 타입 지정해서 쓰기!
    }
}
