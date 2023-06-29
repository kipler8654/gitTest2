public class Main {
    public static void main(String[] args) {
        Student student = new Student("xiaomi redmi", 20, "Anton");
        try {
            Student student1 = (Student) student.clone();
            student1.setPhoneModel("iPhone");
            student1.setAge(21);
            student1.setName("Andrey");
            System.out.println(student1);
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        Storage<Integer, Student> storage = new Storage<>();
        storage.put(21, student);
        storage.get(21);
    }
}