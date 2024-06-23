

public class MyArrayList {
    private int[] array;
    private int size;

    public MyArrayList() {
        array = new int[10];
        size = 0;
    }

    //    Method to add an element
    public void add(int element) {
        if (array.length == size) {
            resize();
        }
        array[size++] = element;
    }

    //    Method to get an element
    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return array[index];
    }

    //    Method to remove specific element
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }

        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
        array[size] = 0;
    }

    //    Method to get size
    public int size() {
        return size;
    }

    //    Method to resize the array
    public void resize() {
        int newArray[] = new int[array.length * 2];
        arrayCopy(array, 0, newArray, 0, array.length);
        array = newArray;
    }

    //    Method to print arrayList
    public void printArrayList() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // Method to arrayCopy
    public static void arrayCopy(int srcArray[], int src, int destArray[], int dest, int len) {

        if (src < 0 || dest >= len) {
            throw new IndexOutOfBoundsException("Src: " + src + ", dest: " + dest + ", len: " + len);
        }

        for (int i = src; i < len; i++) {
            destArray[i] = srcArray[i];
        }

    }

    public static void main(String args[]) {

        MyArrayList list = new MyArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        System.out.println("List elements:");
        list.printArrayList();

        System.out.println("Element at index 2: " + list.get(2));

        list.remove(2);
        System.out.println("List after removing element at index 2:");
        list.printArrayList();

        System.out.println("Size of list: " + list.size());

    }
}
