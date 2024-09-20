public class student {
    private String name;
    private int age;

    public student (String StudentName, int StudentAge) {
        name = StudentName;
        age = StudentAge;
    }
    public void greeting() {
        System.out.println("Hello, I am " + name + " and I am " + age + " years old");
    }
}
