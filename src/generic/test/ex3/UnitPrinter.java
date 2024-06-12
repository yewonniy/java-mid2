package generic.test.ex3;

import generic.test.ex3.unit.BioUnit;
import generic.test.ex3.unit.Marine;

public class UnitPrinter {
    // 제네릭 메서드
    public static <T extends BioUnit> void printV1(Shuttle<T> shuttle) {
        T t = shuttle.out();
        System.out.println("이름: " + t.getName() + ", HP: " + t.getHp());
    }

    // 와일드 카드
    public static void printV2(Shuttle<? extends BioUnit> shuttle) {
        BioUnit unit = shuttle.out();
        System.out.println("이름: " + unit.getName() + ", HP: " + unit.getHp());
    }
}
