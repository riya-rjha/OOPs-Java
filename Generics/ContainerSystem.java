package Generics;

import java.util.*;

public class ContainerSystem {

    /*
     * An LC Question that asks to implement a Container Design System.
     * The Design system must include one comparator and two methods: find and
     * change.
     * The find(int number) finds the smallest index for the required number stored.
     * The change(int idx, int number) updates the value of number at the given
     * index.
     */

    class NumberContainers {

        private Map<Integer, TreeSet<Integer>> numberToIndices;
        private Map<Integer, Integer> indexToNumber;

        public NumberContainers() {
            numberToIndices = new HashMap<>();
            indexToNumber = new HashMap<>();
        }

        public void change(int index, int number) {
            if (indexToNumber.containsKey(index)) {
                int prevNumber = indexToNumber.get(index);
                numberToIndices.get(prevNumber).remove(index);
                if (numberToIndices.get(prevNumber).isEmpty()) {
                    numberToIndices.remove(prevNumber);
                }
            }
            indexToNumber.put(index, number);
            numberToIndices.putIfAbsent(number, new TreeSet<>());
            numberToIndices.get(number).add(index);
        }

        public int find(int number) {
            if (numberToIndices.containsKey(number)) {
                return numberToIndices.get(number).first();
            }
            return -1;
        }
    }

    public static void main(String[] args) {
        ContainerSystem containerSystem = new ContainerSystem();
        NumberContainers obj = containerSystem.new NumberContainers();
        System.out.println(obj.find(10));
        obj.change(2, 10);
        obj.change(1, 10);
        obj.change(3, 10);
        obj.change(5, 10);
        obj.change(1, 20);
        System.out.println(obj.find(10));
    }
}
