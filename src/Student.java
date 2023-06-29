public class Student implements Cloneable {
    private String phoneModel;
    private int age;
    private String name;

    public Student(String phoneModel, int age, String name) {
        this.phoneModel = phoneModel;
        this.age = age;
        this.name = name;
    }

    public String getPhoneModel() {
        return phoneModel;
    }

    public void setPhoneModel(String phoneModel) {
        this.phoneModel = phoneModel;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Student{" +
                "phoneModel='" + phoneModel + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
