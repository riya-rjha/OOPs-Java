package Generics;

import java.util.ArrayList;

public class CustomArrayList {
    public class List {
        static int[] arr = new int[1000];
        static int size = 0;
        static int k = 0;

        List() {
        }

        public void add(int el) {
            arr[k++] = el;
            size++;
        }

        public int remove(int index) {
            int removedElement = 0;
            if (index == 0) {
                size--;
                return arr[0];
            }
            if (index >= size) {
                System.out.println("Invalid index being accessed");
                return -1;
            }
            for (int i = 1; i < size - 1; i++) {
                if (i == index) {
                    removedElement = arr[index];
                    while (i != size - 1) {
                        arr[i] = arr[i + 1];
                        i++;
                    }
                    break;
                }
            }
            size--;
            return removedElement;
        }

        public int get(int index) {
            for (int i = 0; i < size; i++) {
                if (index == i) {
                    return arr[index];
                }
            }
            return -1;
        }

        public int size() {
            return size;
        }

        @Override
        public String toString() {
            System.out.println("List elements are: ");
            for (int i = 0; i < size; i++) {
                System.out.print(arr[i] + " ");
            }
            return "";
        }

    }

    public static void main(String[] args) {
        // Using inbuilt ArrayList
        System.out.println("Using Inbuilt ArrayList: ");
        ArrayList<Integer> list = new ArrayList<>();
        list.add(13);
        list.add(64);
        list.add(29);
        list.add(14);
        list.add(43);
        System.out.println("Size of List: " + list.size());
        System.out.println(list);
        int n = list.remove(0);
        System.out.println("Removed element: " + n);
        System.out.println("Size of List: " + list.size());
        System.out.println(list);
        System.out.println("Element at index 1 : " + list.get(1));

        // Creating custom arrayList
        System.out.println();
        System.out.println("Using Custom ArrayList: ");
        CustomArrayList customArrayList = new CustomArrayList();
        List list2 = customArrayList.new List();
        list2.add(21);
        list2.add(33);
        list2.add(91);
        list2.add(11);
        list2.add(41);
        System.out.println(list2);
        System.out.println("Size of list: " + list2.size());
        int x = list2.remove(1);
        System.out.println("Element removed: " + x);
        System.out.println("Size of List: " + list2.size());
        System.out.println(list2);
        System.out.println("Element at index 1 : " + list2.get(1));
    }
}