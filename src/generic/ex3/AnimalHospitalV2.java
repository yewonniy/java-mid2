package generic.ex3;

public class AnimalHospitalV2<T> {

    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    public void checkup() {
        // T의 타입을 메서드를 정의하는 시점에는 알 수 없다. Object의 기능만 사용할 수 있음!
        animal.toString();
        animal.equals(null);

        // animal의 타입이 뭐가 될지 알 수 없다!!! 라는 것! (아래꺼 컴파일 오류)
        // System.out.println("동물 이름: " + animal.getName());
        // System.out.println("동물 크기: " + animal.getSize());
        // animal.sound();
    }

    public T bigger(T target) {
        // return animal.getSize() > target.getSize() ? animal : target;
        return null;
    }
}
