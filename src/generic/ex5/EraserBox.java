package generic.ex5;

public class EraserBox <T> {

    public boolean instanceCheck(Object param) {
        // return param instanceof T; // 불가 (항상 true가 되기 때문)
        return false;
    }

    public void create() {
        // return new T(); (항상 Object가 생성되기 때문)
        return;
    }
}
