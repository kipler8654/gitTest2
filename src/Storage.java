public class Storage<T, K> {
    private T key;
    private K value;

    public void put(T key, K value) {
        this.key = key;
        this.value = value;
    }

    public void get(T key) {
        if (this.key == key) {
            System.out.println(value);
        } else {
            System.out.println("error");
        }
    }
}
