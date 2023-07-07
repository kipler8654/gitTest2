import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MyArraylist<String> arraylist = new MyArraylist<>();
        arraylist.add("test");
        arraylist.add("hi");
        arraylist.add("hello");
        arraylist.add("world");
        arraylist.remove("world");
        for (int i = 0; i < arraylist.getSize(); i++) {
            System.out.print(arraylist.get(i) + " ");
        }
    }
}