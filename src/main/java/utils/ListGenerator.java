package utils;

import java.util.*;

public class ListGenerator {
    private final ArrayList<Integer> list;

    public ListGenerator(int size) {
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < size + 1; i++) {
            numbers.add(i);
        }

        Collections.shuffle(numbers);
        this.list = numbers;
    }

    public Integer[] getList() {
        return list.toArray(Integer[]::new);
    }

    public Integer[] getListDesc() {
        return Arrays.stream(this.getList()).sorted(Comparator.reverseOrder()).toList().toArray(Integer[]::new);
    }

    public Integer[] getListAsc() {
        return Arrays.stream(this.getList()).sorted(Comparator.naturalOrder()).toList().toArray(Integer[]::new);
    }
}
