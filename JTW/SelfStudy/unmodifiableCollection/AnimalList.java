package unmodifiableCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AnimalList {
    private final List<Animal> animals;

    public AnimalList(final List<Animal> animals) {
        this.animals = new ArrayList<>(animals); // 생성자 인자를 그대로 참조하지 않고 새로운 List를 만들어 값을 복사해야한다.
    }

    public List<Animal> getAnimals() {
        return Collections.unmodifiableList(animals); // unmodifiableList 을 사용하여 getter를 통해 값을 추가, 삭제가 불가능하게 해야한다.
    }
}
