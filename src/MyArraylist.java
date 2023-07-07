public class MyArraylist<T> {
    private T[] array;
    private int size;

    public MyArraylist() {
        array = (T[]) new Object[10];
        size = 0;
    }

    public void add(T value) {
        if (size >= array.length) {
            T[] ar1 = (T[]) new Object[array.length * 2];
            for (int i = 0; i < array.length; i++) {
                ar1[i] = array[i];
            }
            array = ar1;
        }
        array[size] = value;
        size++;
    }

    public void add(int index, T value) {
        if (index < 0 || index >= size) {
            System.out.println("Error");
        }
        if (size >= array.length) {
            T[] ar1 = (T[]) new Object[array.length * 2];
            for (int i = 0; i < array.length; i++) {
                ar1[i] = array[i];
            }
            array = ar1;
        }
        for (int i = size; i > index; i--) {
            array[size] = array[size - 1];
        }
        array[index] = value;
        size++;
    }

    public void addAll(MyArraylist<T> list) {
        for (int i = 0; i < list.size; i++) {
            add(list.get(i));
        }
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Error");
        }
        return array[index];
    }

    public void set(T value, int index) {
        if(index < 0 || index >= size){
            System.out.println("Error");
        }
        array[index] = value;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int getSize() {
        return size;
    }

    public T remove(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Error");
        }
        T removedElement = array[index];
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
        return removedElement;
    }

    public T remove(T value) {
        for (int i = 0; i < getSize(); i++) {
            if (array[i] == value) {
                array[i] = array[i + 1];
                size--;
                return value;
            }
        }
        System.out.println("NotFoundElement");
        return null;
    }
}