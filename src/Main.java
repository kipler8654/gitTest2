public class Main {
    public static void main(String[] args) {
        MyLinkedList<String> linkedList = new MyLinkedList<>();
        linkedList.add("hi");
        linkedList.add("hello");
        linkedList.add("hello World!");
        System.out.println(linkedList.get(2) + ", " + linkedList.get(0));
    }
}