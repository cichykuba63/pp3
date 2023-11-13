package afterClass;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isAdult() {
        if (this.age >= 18)
            return true;
        else
            return false;
    }

    @Override
    public String toString() {
        return this.name + "," + this.age;
    }

    public static void main(String[] args) {
        Person p1 = new Person("Alina", 18);

        System.out.println(p1.getAge());
        System.out.println(p1.isAdult());
        System.out.println(p1.toString());

    }
}
